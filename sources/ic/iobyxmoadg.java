package ic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final File f42362iobyxmoadg;

    public iobyxmoadg(gc.lqeggnwhkg lqeggnwhkgVar) {
        this.f42362iobyxmoadg = lqeggnwhkgVar.lqeggnwhkg("com.crashlytics.settings.json");
    }

    private File iobyxmoadg() {
        return this.f42362iobyxmoadg;
    }

    public void ppxfxbqfkf(long j13, JSONObject jSONObject) throws Throwable {
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j13);
                    FileWriter fileWriter2 = new FileWriter(iobyxmoadg());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        ac.btonecajqb.gxszxtbevo(fileWriter2, "Failed to close settings writer.");
                    } catch (Exception e13) {
                        e = e13;
                        fileWriter = fileWriter2;
                        xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Failed to cache settings", e);
                        ac.btonecajqb.gxszxtbevo(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter = fileWriter2;
                        ac.btonecajqb.gxszxtbevo(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e14) {
                e = e14;
            }
        }
    }

    public JSONObject zoijcleaow() throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileIobyxmoadg = iobyxmoadg();
                if (fileIobyxmoadg.exists()) {
                    fileInputStream = new FileInputStream(fileIobyxmoadg);
                    try {
                        jSONObject = new JSONObject(ac.btonecajqb.pmvmpeiblj(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e13) {
                        e = e13;
                        xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Failed to fetch cached settings", e);
                        ac.btonecajqb.gxszxtbevo(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Settings file does not exist.");
                    jSONObject = null;
                }
                ac.btonecajqb.gxszxtbevo(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th3) {
                th2 = th3;
                ac.btonecajqb.gxszxtbevo(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Exception e14) {
            e = e14;
            fileInputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            ac.btonecajqb.gxszxtbevo(null, "Error while closing settings cache file.");
            throw th2;
        }
    }
}
