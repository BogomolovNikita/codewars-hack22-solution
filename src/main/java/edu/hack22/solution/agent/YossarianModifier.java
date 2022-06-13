package edu.hack22.solution.agent;

import edu.hack22.solution.Yossarian;

import java.io.DataInputStream;
import java.io.File;
import java.nio.file.Files;

public class YossarianModifier {
    public static byte[] modify() throws Exception {
        String yossarianClassFullPath = Yossarian.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath()
                + Yossarian.class.getName().replace('.', '/')
                + ".class";

        File yossarianClassFile = new File(yossarianClassFullPath);
        byte[] targetClassFile = new byte[(int) yossarianClassFile.length()];

        DataInputStream dis = new DataInputStream(Files.newInputStream(yossarianClassFile.toPath()));
        dis.readFully(targetClassFile);
        dis.close();

        //Let's find the bytes responsible for the result of the isCrazy method and replaced false with true.
        int positionToChange = -1;
        for (int i = 0; i < targetClassFile.length - 4; i++) {
            byte b1 = targetClassFile[i];
            byte b2 = targetClassFile[i + 1];
            byte b3 = targetClassFile[i + 2];
            byte b4 = targetClassFile[i + 3];
            if (b1 == 0x00 && b2 == 0x00 && b3 == 0x02 && b4 == 0x03) {
                positionToChange = i + 3;
            }
        }
        if (positionToChange != -1) {
            targetClassFile[positionToChange] = 0x04;
        }
        return targetClassFile;
    }
}
