@ECHO OFF

title "hacker rank challenge java app"

:: Color attributes are specified by TWO hex digits 
:: the first corresponds to the background
:: the second the foreground

:: Example: "COLOR fc" produces light red on bright white
   
:: 0 = Black       8 = Gray
:: 1 = Blue        9 = Light Blue
:: 2 = Green       A = Light Green
:: 3 = Aqua        B = Light Aqua
:: 4 = Red         C = Light Red
:: 5 = Purple      D = Light Purple
:: 6 = Yellow      E = Light Yellow
:: 7 = White       F = Bright White

rem background/foreground
color 0A

echo "hacker rank challenge java app"

echo date:

date /t 

echo time:

time /t

echo starting app...

echo cd /D %~dp0

GOTO start

:start 
javac com/tech/hacker_rank_solve_me_first/*.java
java com/tech/hacker_rank_solve_me_first/hacker_rank_solve_me

GOTO pause

:pause
pause

GOTO finish

:finish
exit











