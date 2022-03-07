main: main.java history.java
	javac main.java history.java
run: main
	main
	java main
clean:
	rm *.class