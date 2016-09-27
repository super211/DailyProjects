type scheduler.log | find "analysis complete (" >> 0result.txt

set sum=0
for /f "tokens=12 delims=, " %%A in (
  'findstr /rc:"Pass: [0-9]*\," "scheduler.log"'
) do (
echo %%A
set /A sum=sum + %%A
)
echo %sum%

set sum2=0
for /f "tokens=14 delims=, " %%A in (
  'findstr /rc:"Pass: [0-9]*\," "scheduler.log"'
) do (
echo %%A
set /A sum2=sum2 + %%A
)
set /A sum2=sum2 - 150 - 9
echo %sum2%

set /A sum3=%sum% + %sum2%

For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c-%%a-%%b)
For /f "tokens=1-2 delims=/:" %%a in ('time /t') do (set mytime=%%a:%%b)

echo %mydate%_%mytime% Total Pass: %sum%, Total Fail: %sum2%, Total Tests: %sum3% >> 0result.txt
echo. >>0result.txt
