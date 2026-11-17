package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class yggfygwlhe {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f24821ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f24822iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f24823zoijcleaow;

    private yggfygwlhe(Context context, String str) {
        this.f24822iobyxmoadg = context;
        this.f24823zoijcleaow = str;
    }

    public static synchronized yggfygwlhe ppxfxbqfkf(Context context, String str) {
        Map map;
        try {
            map = f24821ppxfxbqfkf;
            if (!map.containsKey(str)) {
                map.put(str, new yggfygwlhe(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (yggfygwlhe) map.get(str);
    }

    public synchronized Void eablkybsjg(lqeggnwhkg lqeggnwhkgVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f24822iobyxmoadg.openFileOutput(this.f24823zoijcleaow, 0);
        try {
            fileOutputStreamOpenFileOutput.write(lqeggnwhkgVar.toString().getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th2) {
            fileOutputStreamOpenFileOutput.close();
            throw th2;
        }
        return null;
    }

    public synchronized Void iobyxmoadg() {
        this.f24822iobyxmoadg.deleteFile(this.f24823zoijcleaow);
        return null;
    }

    public synchronized lqeggnwhkg wkgbmnqykc() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            try {
                fileInputStreamOpenFileInput = this.f24822iobyxmoadg.openFileInput(this.f24823zoijcleaow);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    lqeggnwhkg lqeggnwhkgVarZoijcleaow = lqeggnwhkg.zoijcleaow(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                    return lqeggnwhkgVarZoijcleaow;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th5) {
            fileInputStreamOpenFileInput = null;
            th2 = th5;
        }
    }

    String zoijcleaow() {
        return this.f24823zoijcleaow;
    }
}
