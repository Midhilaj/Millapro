package com.createvirtualshop.millapro;

import java.io.DataOutputStream;
import java.io.File;

/**
 * Created by test on 12/31/16.
 */

public class MillaRootchecker {
    public static boolean isDeviceRooted() {
        try
        {
            Process p = Runtime.getRuntime().exec("su", null, new File("/"));
            DataOutputStream os = new DataOutputStream( p.getOutputStream());
            os.writeBytes("pwd\n");
            os.writeBytes("exit\n");
            os.flush();
            p.waitFor();
            p.destroy();
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
        // return checkRootMethod1() || checkRootMethod2() || checkRootMethod3();
    }
}
