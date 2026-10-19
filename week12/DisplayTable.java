import javax.swing.*;
import java.io.*;
public class DisplayTable {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("Table.txt"));
            String headerLine = br.readLine();
            String[] columns = headerLine.split(",");
            java.util.Vector<String> columnNames =new java.util.Vector<>();
            for (String col : columns) {
                columnNames.add(col.trim());
            }
            java.util.Vector<java.util.Vector<String>> data = new java.util.Vector<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",", -1);
                java.util.Vector<String> row =new java.util.Vector<>();
                for (String value : values) {
                    row.add(value.trim());
                }
                data.add(row);
            }
            br.close();
            JTable table = new JTable(data, columnNames);
            JScrollPane sp = new JScrollPane(table);
            JFrame f = new JFrame("Table Display");
            f.add(sp);
            f.setSize(500, 300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
