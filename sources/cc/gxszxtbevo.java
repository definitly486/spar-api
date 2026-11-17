package cc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Charset f19576zoijcleaow = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gc.lqeggnwhkg f19577iobyxmoadg;

    class iobyxmoadg extends JSONObject {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f19578iobyxmoadg;

        iobyxmoadg(String str) throws JSONException {
            this.f19578iobyxmoadg = str;
            put("userId", str);
        }
    }

    public gxszxtbevo(gc.lqeggnwhkg lqeggnwhkgVar) {
        this.f19577iobyxmoadg = lqeggnwhkgVar;
    }

    private static String agtfadlqog(String str) {
        return new iobyxmoadg(str).toString();
    }

    private static String draadjrbmk(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i13 = 0; i13 < list.size(); i13++) {
            try {
                jSONArray.put(new JSONObject(dxjokdxxww.f19568iobyxmoadg.zoijcleaow(list.get(i13))));
            } catch (JSONException e13) {
                xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Exception parsing rollout assignment!", e13);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static Map eablkybsjg(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, ojitshcjhn(jSONObject, next));
        }
        return map;
    }

    private static List gxszxtbevo(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            String string = jSONArray.getString(i13);
            try {
                arrayList.add(dxjokdxxww.iobyxmoadg(string));
            } catch (Exception e13) {
                xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Failed de-serializing rollouts state. " + string, e13);
            }
        }
        return arrayList;
    }

    private String lqeggnwhkg(String str) {
        return ojitshcjhn(new JSONObject(str), "userId");
    }

    private static String nufgyqmvbu(Map map) {
        return new JSONObject(map).toString();
    }

    private static String ojitshcjhn(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    private static void wflxmlrfwp(File file) {
        if (file.exists() && file.delete()) {
            xb.lqeggnwhkg.gxszxtbevo().lqeggnwhkg("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public List btonecajqb(String str) throws Throwable {
        File filePpxfxbqfkf = ppxfxbqfkf(str);
        if (!filePpxfxbqfkf.exists() || filePpxfxbqfkf.length() == 0) {
            wflxmlrfwp(filePpxfxbqfkf);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(filePpxfxbqfkf);
                try {
                    List listGxszxtbevo = gxszxtbevo(ac.btonecajqb.pmvmpeiblj(fileInputStream2));
                    xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Loaded rollouts state:\n" + listGxszxtbevo + "\nfor session " + str);
                    ac.btonecajqb.gxszxtbevo(fileInputStream2, "Failed to close rollouts state file.");
                    return listGxszxtbevo;
                } catch (Exception e13) {
                    e = e13;
                    fileInputStream = fileInputStream2;
                    xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Error deserializing rollouts state.", e);
                    wflxmlrfwp(filePpxfxbqfkf);
                    ac.btonecajqb.gxszxtbevo(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    ac.btonecajqb.gxszxtbevo(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    Map dxjokdxxww(String str, boolean z13) throws Throwable {
        FileInputStream fileInputStream;
        Exception e13;
        File fileIobyxmoadg = z13 ? iobyxmoadg(str) : zoijcleaow(str);
        if (fileIobyxmoadg.exists()) {
            ?? length = fileIobyxmoadg.length();
            if (length != 0) {
                ?? r13 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileIobyxmoadg);
                        try {
                            Map mapEablkybsjg = eablkybsjg(ac.btonecajqb.pmvmpeiblj(fileInputStream));
                            ac.btonecajqb.gxszxtbevo(fileInputStream, "Failed to close user metadata file.");
                            return mapEablkybsjg;
                        } catch (Exception e14) {
                            e13 = e14;
                            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Error deserializing user metadata.", e13);
                            wflxmlrfwp(fileIobyxmoadg);
                            ac.btonecajqb.gxszxtbevo(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = length;
                        ac.btonecajqb.gxszxtbevo(r13, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e15) {
                    fileInputStream = null;
                    e13 = e15;
                } catch (Throwable th3) {
                    th = th3;
                    ac.btonecajqb.gxszxtbevo(r13, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        wflxmlrfwp(fileIobyxmoadg);
        return Collections.emptyMap();
    }

    public String gtknphoqwx(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileWkgbmnqykc = wkgbmnqykc(str);
        FileInputStream fileInputStream2 = null;
        if (!fileWkgbmnqykc.exists() || fileWkgbmnqykc.length() == 0) {
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("No userId set for session " + str);
            wflxmlrfwp(fileWkgbmnqykc);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileWkgbmnqykc);
            try {
                try {
                    String strLqeggnwhkg = lqeggnwhkg(ac.btonecajqb.pmvmpeiblj(fileInputStream));
                    xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Loaded userId " + strLqeggnwhkg + " for session " + str);
                    ac.btonecajqb.gxszxtbevo(fileInputStream, "Failed to close user metadata file.");
                    return strLqeggnwhkg;
                } catch (Exception e13) {
                    e = e13;
                    xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Error deserializing user metadata.", e);
                    wflxmlrfwp(fileWkgbmnqykc);
                    ac.btonecajqb.gxszxtbevo(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                ac.btonecajqb.gxszxtbevo(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            ac.btonecajqb.gxszxtbevo(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public File iobyxmoadg(String str) {
        return this.f19577iobyxmoadg.vdvldrhtss(str, "internal-keys");
    }

    public void kcexrzcfyt(String str, String str2) throws Throwable {
        File fileWkgbmnqykc = wkgbmnqykc(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strAgtfadlqog = agtfadlqog(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileWkgbmnqykc), f19576zoijcleaow));
                try {
                    bufferedWriter2.write(strAgtfadlqog);
                    bufferedWriter2.flush();
                    ac.btonecajqb.gxszxtbevo(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e13) {
                    e = e13;
                    bufferedWriter = bufferedWriter2;
                    xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Error serializing user metadata.", e);
                    ac.btonecajqb.gxszxtbevo(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    ac.btonecajqb.gxszxtbevo(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void oxmwwwfdhm(String str, List list) throws Throwable {
        File filePpxfxbqfkf = ppxfxbqfkf(str);
        if (list.isEmpty()) {
            wflxmlrfwp(filePpxfxbqfkf);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strDraadjrbmk = draadjrbmk(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePpxfxbqfkf), f19576zoijcleaow));
                try {
                    bufferedWriter2.write(strDraadjrbmk);
                    bufferedWriter2.flush();
                    ac.btonecajqb.gxszxtbevo(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e13) {
                    e = e13;
                    bufferedWriter = bufferedWriter2;
                    xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Error serializing rollouts state.", e);
                    wflxmlrfwp(filePpxfxbqfkf);
                    ac.btonecajqb.gxszxtbevo(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    ac.btonecajqb.gxszxtbevo(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    public File ppxfxbqfkf(String str) {
        return this.f19577iobyxmoadg.vdvldrhtss(str, "rollouts-state");
    }

    public void rgvfuqvkyq(String str, Map map) throws Throwable {
        vdvldrhtss(str, map, false);
    }

    public void vdvldrhtss(String str, Map map, boolean z13) throws Throwable {
        File fileIobyxmoadg = z13 ? iobyxmoadg(str) : zoijcleaow(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strNufgyqmvbu = nufgyqmvbu(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileIobyxmoadg), f19576zoijcleaow));
                try {
                    bufferedWriter2.write(strNufgyqmvbu);
                    bufferedWriter2.flush();
                    ac.btonecajqb.gxszxtbevo(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e13) {
                    e = e13;
                    bufferedWriter = bufferedWriter2;
                    xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Error serializing key/value metadata.", e);
                    wflxmlrfwp(fileIobyxmoadg);
                    ac.btonecajqb.gxszxtbevo(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    ac.btonecajqb.gxszxtbevo(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    public File wkgbmnqykc(String str) {
        return this.f19577iobyxmoadg.vdvldrhtss(str, "user-data");
    }

    public File zoijcleaow(String str) {
        return this.f19577iobyxmoadg.vdvldrhtss(str, "keys");
    }
}
