compileTest:
	cd src && javac App/MainTest.java -d ../bin

runTest: compileTest
	cd bin && java App.MainTest