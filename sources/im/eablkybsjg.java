package im;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public class eablkybsjg extends org.xbill.DNS.config.zoijcleaow {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f44969gxszxtbevo = 1;

    private boolean ojitshcjhn(String str) {
        Path path = Paths.get(str, new String[0]);
        if (Files.exists(path, new LinkOption[0])) {
            try {
                InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
                try {
                    agtfadlqog(inputStreamNewInputStream);
                    if (inputStreamNewInputStream == null) {
                        return true;
                    }
                    inputStreamNewInputStream.close();
                    return true;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        if (inputStreamNewInputStream != null) {
                            try {
                                inputStreamNewInputStream.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected void agtfadlqog(InputStream inputStream) throws IOException {
        byte b13;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        inputStreamReader.close();
                        String str = System.getenv("LOCALDOMAIN");
                        if (str != null && !str.isEmpty()) {
                            this.f74285ppxfxbqfkf.clear();
                            draadjrbmk(str, " ");
                        }
                        String str2 = System.getenv("RES_OPTIONS");
                        if (str2 == null || str2.isEmpty()) {
                            return;
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(str2, " ");
                        while (stringTokenizer.hasMoreTokens()) {
                            String strNextToken = stringTokenizer.nextToken();
                            if (strNextToken.startsWith("ndots:")) {
                                this.f44969gxszxtbevo = gtknphoqwx(strNextToken.substring(6));
                            }
                        }
                        return;
                    }
                    StringTokenizer stringTokenizer2 = new StringTokenizer(line);
                    if (stringTokenizer2.hasMoreTokens()) {
                        String strNextToken2 = stringTokenizer2.nextToken();
                        switch (strNextToken2.hashCode()) {
                            case -1326197564:
                                if (!strNextToken2.equals("domain")) {
                                    b13 = -1;
                                } else {
                                    b13 = 1;
                                }
                                break;
                            case -1249474914:
                                if (!strNextToken2.equals("options")) {
                                    b13 = -1;
                                } else {
                                    b13 = 3;
                                }
                                break;
                            case -906336856:
                                if (!strNextToken2.equals("search")) {
                                    b13 = -1;
                                } else {
                                    b13 = 2;
                                }
                                break;
                            case 154424718:
                                if (!strNextToken2.equals("nameserver")) {
                                    b13 = -1;
                                } else {
                                    b13 = 0;
                                }
                                break;
                            default:
                                b13 = -1;
                                break;
                        }
                        if (b13 == 0) {
                            lqeggnwhkg(new InetSocketAddress(stringTokenizer2.nextToken(), 53));
                        } else if (b13 != 1) {
                            if (b13 == 2) {
                                this.f74285ppxfxbqfkf.clear();
                                while (stringTokenizer2.hasMoreTokens()) {
                                    nufgyqmvbu(stringTokenizer2.nextToken());
                                }
                            } else if (b13 != 3) {
                            }
                            while (stringTokenizer2.hasMoreTokens()) {
                                String strNextToken3 = stringTokenizer2.nextToken();
                                if (strNextToken3.startsWith("ndots:")) {
                                    this.f44969gxszxtbevo = gtknphoqwx(strNextToken3.substring(6));
                                }
                            }
                        } else {
                            this.f74285ppxfxbqfkf.clear();
                            if (stringTokenizer2.hasMoreTokens()) {
                                nufgyqmvbu(stringTokenizer2.nextToken());
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th7) {
                    th5.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    @Override // im.gxszxtbevo
    public void iobyxmoadg() {
        wflxmlrfwp();
        if (ojitshcjhn("/etc/resolv.conf")) {
            return;
        }
        ojitshcjhn("sys:/etc/resolv.cfg");
    }

    @Override // im.gxszxtbevo
    public boolean isEnabled() {
        return (System.getProperty("os.name").contains("Windows") || System.getProperty("java.specification.vendor").toLowerCase().contains(ConstantDeviceInfo.APP_PLATFORM)) ? false : true;
    }

    @Override // im.gxszxtbevo
    public int ppxfxbqfkf() {
        return this.f44969gxszxtbevo;
    }
}
