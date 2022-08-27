# LAB 2

/

### Printing 1  but emoji

```nasm
;print 1
.model small
.stack 100h

.code
main proc
    mov dx, 1

    mov ah,2
    int 21h
    

    main endp
end main 

;printed emoji why!?
```

![Untitled](LAB%202%20494591173cb745d59fd28e284a863923/Untitled.png)

### Printing 1

```nasm
;print 1
.model small
.stack 100h
    
.code
main proc
    
    mov dx, "1"  ;now it will print 1
   
    mov ah,2
    int 21h
    

    main endp
end main
```

![Untitled](LAB%202%20494591173cb745d59fd28e284a863923/Untitled%201.png)

### User Input

```nasm
;user input
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h      ;always takes input at ax aka al
     
    mov dx, ax   ;using full part
    
    mov ah,2
    int 21h
    

    main endp
end main
```

```nasm
;user input 
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h      ;always takes input at ax aka al
     
    mov dl, al   ;using lower part
    
    mov ah,2
    int 21h
    

    main endp
end main
```

BUGYY CODE ,INPUT

```nasm
;user input
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h 
    
				mov cl, al
    
    mov ah,1
    int 21h

		    mov dl, cl    
    
		mov ah,2
    int 21h

		    mov dl, al
    int 21h
    

    main endp
end main
```

```nasm
;user input 2 
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h 
    
    mov cl, al
    
    mov ah,1
    int 21h
    
    mov bl, al
 
    
    mov dl, cl    
    mov ah,2
    int 21h 
    
    mov dl, bl
    int 21h
    

    main endp
end main
```

```nasm
;user input add
.model small
.stack 100h
.data
    msg db "enter a number: $"
    
.code
main proc
    
    mov ah,1
    int 21h 
    
    mov cl, al
    
    mov ah,1
    int 21h
    
    mov bl, al
 
    
    mov dl, cl    
    mov ah,2
    int 21h 
    
    mov dl, bl
    int 21h
    

    main endp
end main
```

```nasm
;user input and add
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h 
    
    mov cl, al
    
    mov ah,1
    int 21h
    
    mov bl, al
 
    add bl, cl ; add cl with bl and  store in bl
            
    
    mov dl, bl
    mov ah, 2
    int 21h
    

    main endp
end main

```

![Untitled](LAB%202%20494591173cb745d59fd28e284a863923/Untitled%202.png)

### Digit Addition

```nasm
;user input addition
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h 
	    mov cl, al    ; 1st value store in cl
    
    mov ah,1
    int 21h
			mov bl, al    ; 2nd value store in bl
 
    add bl, cl      ; add first value with 2nd value and store in bl
    sub bl, 48      ; store digit ascci value in bl [ digit 0 start with 048 in ascci ]
            
    
    mov dl, bl
    mov ah, 2
    int 21h
    

    main endp
end main
```

![Output](LAB%202%20494591173cb745d59fd28e284a863923/Untitled%203.png)

Output

### Digit Subtraction

```nasm
;Substraction
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h 
    
    mov bl, al
    
    mov ah,1
    int 21h
    
    mov cl, al
 
    sub bl, cl ; sub bl from cl and  store in bl
    add bl, 48 ;store digit ascci value in bl 
            
    
    mov dl, bl
    mov ah, 2
    int 21h
    

    main endp
end main
```

![Output](LAB%202%20494591173cb745d59fd28e284a863923/Untitled%204.png)

Output

### 3 Digit Summation

```nasm
;user input addition
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h 
	    mov cl, al    ; 1st value store in cl
    
    mov ah,1
    int 21h
			mov bl, al    ; 2nd value store in bl
 
    add bl, cl      ; add first value with 2nd value and store in bl. bl = cl + bl
    sub bl, 48      ; store digit ascci value in bl [ digit 0 start with 048 in ascci ]
    
    mov ah,1
    int 21h
        mov cl, al  ; 3rd value store in cl
    
    add bl, cl      ; bl = 3rd value + bl, where bl is already summesion of 1st value and 2nd value
    sub bl, 48      ; store digit ascci value in bl
            
    
    mov dl, bl      ; now  print bl, which holds summession of 1st, 2nd and 3rd value
    mov ah, 2
    int 21h
    

    main endp
end main
```

## Negation

```nasm
;user input negation
.model small
.stack 100h
    
.code
main proc
    
    mov ah,1
    int 21h 
	    mov cl, al    ; 1st value store in cl
    
    mov ah,1
    int 21h
			mov bl, al    ; 2nd value store in bl
 
    add bl, cl      ; add first value with 2nd value and store in bl. bl = cl + bl
    sub bl, 48      ; store digit ascci value in bl [ digit 0 start with 048 in ascci ]
    
    mov ah,1
    int 21h
        mov cl, al  ; 3rd value store in cl
    
    add bl, cl      ; bl = 3rd value + bl, where bl is already summesion of 1st value and 2nd value
    sub bl, 48      ; store digit ascci value in bl
            
    neg bl          ; negetion 
    mov dl, bl      ; now  print bl, which holds summession of 1st, 2nd and 3rd value
    mov ah, 2
    int 21h
    

    main endp
end main
```

![Untitled](LAB%202%20494591173cb745d59fd28e284a863923/Untitled%205.png)

🖍️ It seems like negation of  every digit is static 

| C7 | C8 | C9 | CA | CB | CC | CD | CE | CF |
|----|----|----|----|----|----|----|----|----|
|  9 | 8  | 7  | 6  | 5  | 4  | 3  | 2  | 1  |
