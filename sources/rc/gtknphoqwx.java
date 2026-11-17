package rc;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f82518iobyxmoadg;

    public gtknphoqwx(Context context, String str) {
        this.f82518iobyxmoadg = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized String eablkybsjg(String str) {
        for (Map.Entry<String, ?> entry : this.f82518iobyxmoadg.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void iobyxmoadg() {
        try {
            long j13 = this.f82518iobyxmoadg.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f82518iobyxmoadg.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f82518iobyxmoadg.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f82518iobyxmoadg.edit().putStringSet(key, hashSet).putLong("fire-count", j13 - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void nufgyqmvbu(String str) {
        try {
            String strEablkybsjg = eablkybsjg(str);
            if (strEablkybsjg == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f82518iobyxmoadg.getStringSet(strEablkybsjg, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f82518iobyxmoadg.edit().remove(strEablkybsjg).commit();
            } else {
                this.f82518iobyxmoadg.edit().putStringSet(strEablkybsjg, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void wflxmlrfwp(String str, String str2) {
        nufgyqmvbu(str2);
        HashSet hashSet = new HashSet(this.f82518iobyxmoadg.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f82518iobyxmoadg.edit().putStringSet(str, hashSet).commit();
    }

    private synchronized String wkgbmnqykc(long j13) {
        return new Date(j13).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    synchronized boolean btonecajqb(String str, long j13) {
        if (!this.f82518iobyxmoadg.contains(str)) {
            this.f82518iobyxmoadg.edit().putLong(str, j13).commit();
            return true;
        }
        if (gxszxtbevo(this.f82518iobyxmoadg.getLong(str, -1L), j13)) {
            return false;
        }
        this.f82518iobyxmoadg.edit().putLong(str, j13).commit();
        return true;
    }

    synchronized void draadjrbmk(long j13) {
        this.f82518iobyxmoadg.edit().putLong("fire-global", j13).commit();
    }

    synchronized boolean dxjokdxxww(long j13) {
        return btonecajqb("fire-global", j13);
    }

    synchronized void gtknphoqwx(long j13, String str) {
        String strWkgbmnqykc = wkgbmnqykc(j13);
        if (this.f82518iobyxmoadg.getString("last-used-date", "").equals(strWkgbmnqykc)) {
            String strEablkybsjg = eablkybsjg(strWkgbmnqykc);
            if (strEablkybsjg == null) {
                return;
            }
            if (strEablkybsjg.equals(str)) {
                return;
            }
            wflxmlrfwp(str, strWkgbmnqykc);
            return;
        }
        long j14 = this.f82518iobyxmoadg.getLong("fire-count", 0L);
        if (j14 + 1 == 30) {
            iobyxmoadg();
            j14 = this.f82518iobyxmoadg.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f82518iobyxmoadg.getStringSet(str, new HashSet()));
        hashSet.add(strWkgbmnqykc);
        this.f82518iobyxmoadg.edit().putStringSet(str, hashSet).putLong("fire-count", j14 + 1).putString("last-used-date", strWkgbmnqykc).commit();
    }

    synchronized boolean gxszxtbevo(long j13, long j14) {
        return wkgbmnqykc(j13).equals(wkgbmnqykc(j14));
    }

    synchronized void lqeggnwhkg() {
        String strWkgbmnqykc = wkgbmnqykc(System.currentTimeMillis());
        this.f82518iobyxmoadg.edit().putString("last-used-date", strWkgbmnqykc).commit();
        nufgyqmvbu(strWkgbmnqykc);
    }

    synchronized List ppxfxbqfkf() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f82518iobyxmoadg.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(wkgbmnqykc(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(draadjrbmk.iobyxmoadg(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            draadjrbmk(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    synchronized void zoijcleaow() {
        try {
            SharedPreferences.Editor editorEdit = this.f82518iobyxmoadg.edit();
            int i13 = 0;
            for (Map.Entry<String, ?> entry : this.f82518iobyxmoadg.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strWkgbmnqykc = wkgbmnqykc(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strWkgbmnqykc)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strWkgbmnqykc);
                        i13++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i13 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i13);
            }
            editorEdit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
