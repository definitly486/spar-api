package s7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final HttpURLConnection f105620zdlpuopuiu;

    public iobyxmoadg(HttpURLConnection httpURLConnection) {
        this.f105620zdlpuopuiu = httpURLConnection;
    }

    private String iobyxmoadg(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb3.append(line);
                    sb3.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb3.toString();
    }

    @Override // s7.wkgbmnqykc
    public String C() {
        try {
            if (iwxlajgraz()) {
                return null;
            }
            return "Unable to fetch " + this.f105620zdlpuopuiu.getURL() + ". Failed with " + this.f105620zdlpuopuiu.getResponseCode() + "\n" + iobyxmoadg(this.f105620zdlpuopuiu);
        } catch (IOException e13) {
            v7.wkgbmnqykc.wkgbmnqykc("get error failed ", e13);
            return e13.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f105620zdlpuopuiu.disconnect();
    }

    @Override // s7.wkgbmnqykc
    public boolean iwxlajgraz() {
        try {
            return this.f105620zdlpuopuiu.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // s7.wkgbmnqykc
    public String jztzpxfvev() {
        return this.f105620zdlpuopuiu.getContentType();
    }

    @Override // s7.wkgbmnqykc
    public InputStream ydmasvzmpa() {
        return this.f105620zdlpuopuiu.getInputStream();
    }
}
