package vc;

import com.google.firebase.gxszxtbevo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private File f116479iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f116480zoijcleaow;

    public enum iobyxmoadg {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        this.f116480zoijcleaow = gxszxtbevoVar;
    }

    private File iobyxmoadg() {
        if (this.f116479iobyxmoadg == null) {
            synchronized (this) {
                try {
                    if (this.f116479iobyxmoadg == null) {
                        this.f116479iobyxmoadg = new File(this.f116480zoijcleaow.gtknphoqwx().getFilesDir(), "PersistedInstallation." + this.f116480zoijcleaow.ojitshcjhn() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f116479iobyxmoadg;
    }

    private JSONObject ppxfxbqfkf() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(iobyxmoadg());
            while (true) {
                try {
                    int i13 = fileInputStream.read(bArr, 0, 16384);
                    if (i13 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i13);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public wkgbmnqykc wkgbmnqykc() {
        JSONObject jSONObjectPpxfxbqfkf = ppxfxbqfkf();
        String strOptString = jSONObjectPpxfxbqfkf.optString("Fid", null);
        int iOptInt = jSONObjectPpxfxbqfkf.optInt("Status", iobyxmoadg.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectPpxfxbqfkf.optString("AuthToken", null);
        String strOptString3 = jSONObjectPpxfxbqfkf.optString("RefreshToken", null);
        long jOptLong = jSONObjectPpxfxbqfkf.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectPpxfxbqfkf.optLong("ExpiresInSecs", 0L);
        return wkgbmnqykc.iobyxmoadg().wkgbmnqykc(strOptString).lqeggnwhkg(iobyxmoadg.values()[iOptInt]).zoijcleaow(strOptString2).gxszxtbevo(strOptString3).nufgyqmvbu(jOptLong).ppxfxbqfkf(jOptLong2).eablkybsjg(jSONObjectPpxfxbqfkf.optString("FisError", null)).iobyxmoadg();
    }

    public wkgbmnqykc zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", wkgbmnqykcVar.wkgbmnqykc());
            jSONObject.put("Status", wkgbmnqykcVar.lqeggnwhkg().ordinal());
            jSONObject.put("AuthToken", wkgbmnqykcVar.zoijcleaow());
            jSONObject.put("RefreshToken", wkgbmnqykcVar.gxszxtbevo());
            jSONObject.put("TokenCreationEpochInSecs", wkgbmnqykcVar.nufgyqmvbu());
            jSONObject.put("ExpiresInSecs", wkgbmnqykcVar.ppxfxbqfkf());
            jSONObject.put("FisError", wkgbmnqykcVar.eablkybsjg());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f116480zoijcleaow.gtknphoqwx().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(iobyxmoadg())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return wkgbmnqykcVar;
    }
}
