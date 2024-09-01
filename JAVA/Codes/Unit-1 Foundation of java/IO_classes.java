/*
    * IO_classes.java
    ******************

    Input and Output Classes:
    ==========================
        Used for reading and writing data.

        Examples:
         FileInputStream, FileOutputStream, BufferedReader, BufferedWriter.
        

        FileInputStream:
        ----------------
            Used to read data from a file as a stream of bytes.
            for this import
            import java.io.FileInputStream;
            Methods:
                1. read(): Reads a byte of data from the input stream.
                2. close(): Closes the input stream.


            Example:
                FileInputStream fis = new FileInputStream("input.txt");
                int data = fis.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = fis.read();
                }
                fis.close();

        
        FileOutputStream:
        -----------------
            Used to write data to a file as a stream of bytes.
            for this import
            import java.io.FileOutputStream;
            Methods:
                1. write(int b): Writes a byte of data to the output stream.
                2. close(): Closes the output stream.

            Example:
                FileOutputStream fos = new FileOutputStream("output.txt");
                String str = "Hello, World!";
                byte[] data = str.getBytes();
                fos.write(data);
                fos.close();


        BufferedReader:
        ---------------
            Used to read text from a character-input stream.
            for this import
            import java.io.BufferedReader;
            Methods:
                1. readLine(): Reads a line of text.
                2. close(): Closes the input stream.

            Example:
                //to read from a file
                    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                    String line = br.readLine();
                    while(line != null) {
                        System.out.println(line);
                        line = br.readLine();
                    }
                    br.close();


                // to read user input
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String name = br.readLine();
                    System.out.println("Hello, " + name);


        
        BufferedWriter:
        ---------------
            Used to write text to a character-output stream.
            for this import
            import java.io.BufferedWriter;
            Methods:
                1. write(String s): Writes a string of text to the output stream.
                2. close(): Closes the output stream.

            Example:

                //to write in a file 
                    BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
                    String str = "Hello, World!";
                    bw.write(str);
                    bw.close();

                // to write to console
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
                    String str = "Hello, World!";
                    bw.write(str);
                    bw.close();



        Scanner:
        --------
            Used to read input from the console.
            for this import
            import java.util.Scanner;
            Methods:
                1. nextInt(): Reads an integer.
                2. nextLine(): Reads a line of text.
                3. close(): Closes the scanner.
                and more...


            Example:
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println("Number: " + num);
                sc.close();


            // Drawback of Scanner:
                - Scanner is slower than BufferedReader for reading input from the console.
                - BufferedReader is preferred for reading large amounts of data.


            // Scanner vs BufferedReader:
                - Scanner is easier to use for reading different types of data.
                - BufferedReader is faster and more efficient for reading large amounts of data.
                
        
        Note:
        -----
            - Always close the input/output streams after use to free up resources.
            - Use try-with-resources to automatically close the streams.
            - Handle exceptions when working with input/output streams.

 */
