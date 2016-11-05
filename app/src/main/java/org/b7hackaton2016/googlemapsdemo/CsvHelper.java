package org.b7hackaton2016.googlemapsdemo;

import org.apache.commons.csv.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CsvHelper {

    public static List<Tree> readTreesFile(InputStream filestream) {
        List<Tree> trees = new ArrayList<Tree>();
        try {
            Reader in = new InputStreamReader(filestream);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);
            for (CSVRecord record : records) {
                Tree tree = new Tree();
                tree.setOBJECTID(record.get("OBJECTID"));
                tree.setNashir(record.get("nashir"));
                tree.setSug(record.get("sug"));
                tree.setGil(record.get("gil"));
                tree.setKoter(record.get("koter"));
                tree.setStatus(record.get("status"));
                tree.setSivug(record.get("sivug"));
                tree.setHibur(record.get("hibur"));
                tree.setX(Float.parseFloat(record.get("X")));
                tree.setY(Float.parseFloat(record.get("Y")));
                tree.setX_google(Float.parseFloat(record.get("X_google")));
                tree.setY_google(Float.parseFloat(record.get("Y_google")));

                trees.add(tree);
            }
            return trees;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trees;
    }
}
