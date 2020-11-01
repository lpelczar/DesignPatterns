package org.lpelczar.structural.decorator;

public class Demo {
  public static void main(String[] args) {
    String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
    DataSourceDecorator encodedAndCompressed =
        new CompressionDecorator(new EncryptionDecorator(new FileDataSource("OutputDemo.txt")));
    encodedAndCompressed.writeData(salaryRecords);
    DataSource plain = new FileDataSource("OutputDemo.txt");

    System.out.println("- Input ----------------");
    System.out.println(salaryRecords);
    System.out.println("- Encoded and compressed --------------");
    System.out.println(plain.readData());
    System.out.println("- Decoded --------------");
    System.out.println(encodedAndCompressed.readData());
  }
}
