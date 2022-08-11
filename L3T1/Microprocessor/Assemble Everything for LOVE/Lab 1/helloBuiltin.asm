include 'emu8086.inc' ;built in print functuion

.model small
.stack 100h
.data      

.code
main proc
    
    print "Hello"
    
    main endp

end main