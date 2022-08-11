.model small         ;model the mode
.stack 100h          ;stack size
.data                ;decleare variable here
    msg db  "hello World hi im not a human$"      

.code
main proc
    
    mov ax, @data    ;access data segment   
    mov ds, ax       ;initiate data segment with ax
    
    lea bx, msg       ;to load string
    
    mov ah, 9        ;tell assembler to output the string
    mov dx, bx       ;move bx->msg to dx
    int 21h          ;print the result 
    
    main endp

end main