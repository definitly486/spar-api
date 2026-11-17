package y9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class hkdspvbjdz implements y9.wkgbmnqykc, z9.iobyxmoadg, y9.ppxfxbqfkf {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final o9.ppxfxbqfkf f124111esjtqupxsv = o9.ppxfxbqfkf.zoijcleaow("proto");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final fg.iobyxmoadg f124112cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final eablkybsjg f124113iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final aa.iobyxmoadg f124114jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final aa.iobyxmoadg f124115yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ulzqkzuiru f124116zdlpuopuiu;

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f124117iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final String f124118zoijcleaow;

        private ppxfxbqfkf(String str, String str2) {
            this.f124117iobyxmoadg = str;
            this.f124118zoijcleaow = str2;
        }
    }

    interface wkgbmnqykc {
        Object iobyxmoadg();
    }

    interface zoijcleaow {
        Object apply(Object obj);
    }

    hkdspvbjdz(aa.iobyxmoadg iobyxmoadgVar, aa.iobyxmoadg iobyxmoadgVar2, eablkybsjg eablkybsjgVar, ulzqkzuiru ulzqkzuiruVar, fg.iobyxmoadg iobyxmoadgVar3) {
        this.f124116zdlpuopuiu = ulzqkzuiruVar;
        this.f124115yggfygwlhe = iobyxmoadgVar;
        this.f124114jyumaefscl = iobyxmoadgVar2;
        this.f124113iwizpuwonk = eablkybsjgVar;
        this.f124112cqumvgiudr = iobyxmoadgVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object A(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        a0(sQLiteDatabase.rawQuery(str2, null), new zoijcleaow() { // from class: y9.jyumaefscl
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124133iobyxmoadg.z((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean B(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object D(String str, t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar, long j13, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) a0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(zoijcleaowVar.getNumber())}), new zoijcleaow() { // from class: y9.esjtqupxsv
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.B((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j13 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(zoijcleaowVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(zoijcleaowVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j13));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object J(long j13, q9.rgvfuqvkyq rgvfuqvkyqVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j13));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{rgvfuqvkyqVar.zoijcleaow(), String.valueOf(ba.iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar.wkgbmnqykc()))}) < 1) {
            contentValues.put("backend_name", rgvfuqvkyqVar.zoijcleaow());
            contentValues.put("priority", Integer.valueOf(ba.iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar.wkgbmnqykc())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object L(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f124115yggfygwlhe.wflxmlrfwp()).execute();
        return null;
    }

    private List M(SQLiteDatabase sQLiteDatabase, final q9.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        final ArrayList arrayList = new ArrayList();
        Long lWeqkydbzbr = weqkydbzbr(sQLiteDatabase, rgvfuqvkyqVar);
        if (lWeqkydbzbr == null) {
            return arrayList;
        }
        a0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lWeqkydbzbr.toString()}, null, null, null, String.valueOf(i13)), new zoijcleaow() { // from class: y9.cqumvgiudr
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124105iobyxmoadg.q(arrayList, rgvfuqvkyqVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map O(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb3 = new StringBuilder("event_id IN (");
        for (int i13 = 0; i13 < list.size(); i13++) {
            sb3.append(((gtknphoqwx) list.get(i13)).ppxfxbqfkf());
            if (i13 < list.size() - 1) {
                sb3.append(',');
            }
        }
        sb3.append(')');
        a0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", ExternalMetricsManagerImpl.NAME, "value"}, sb3.toString(), null, null, null, null), new zoijcleaow() { // from class: y9.lereixgezr
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.r(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] T(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void V(t9.iobyxmoadg.C2702iobyxmoadg c2702iobyxmoadg, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c2702iobyxmoadg.iobyxmoadg(t9.wkgbmnqykc.ppxfxbqfkf().ppxfxbqfkf((String) entry.getKey()).zoijcleaow((List) entry.getValue()).iobyxmoadg());
        }
    }

    private byte[] W(long j13) {
        return (byte[]) a0(czzsidtyhn().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j13)}, null, null, "sequence_num"), new zoijcleaow() { // from class: y9.zynmafqrjb
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.w((Cursor) obj);
            }
        });
    }

    private Object X(wkgbmnqykc wkgbmnqykcVar, zoijcleaow zoijcleaowVar) {
        long jWflxmlrfwp = this.f124114jyumaefscl.wflxmlrfwp();
        while (true) {
            try {
                return wkgbmnqykcVar.iobyxmoadg();
            } catch (SQLiteDatabaseLockedException e13) {
                if (this.f124114jyumaefscl.wflxmlrfwp() >= ((long) this.f124113iwizpuwonk.zoijcleaow()) + jWflxmlrfwp) {
                    return zoijcleaowVar.apply(e13);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static o9.ppxfxbqfkf Y(String str) {
        return str == null ? f124111esjtqupxsv : o9.ppxfxbqfkf.zoijcleaow(str);
    }

    private static String Z(Iterable iterable) {
        StringBuilder sb3 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb3.append(((gtknphoqwx) it.next()).ppxfxbqfkf());
            if (it.hasNext()) {
                sb3.append(',');
            }
        }
        sb3.append(')');
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean a(q9.rgvfuqvkyq rgvfuqvkyqVar, SQLiteDatabase sQLiteDatabase) {
        Long lWeqkydbzbr = weqkydbzbr(sQLiteDatabase, rgvfuqvkyqVar);
        return lWeqkydbzbr == null ? Boolean.FALSE : (Boolean) a0(czzsidtyhn().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lWeqkydbzbr.toString()}), new zoijcleaow() { // from class: y9.yggfygwlhe
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    static Object a0(Cursor cursor, zoijcleaow zoijcleaowVar) {
        try {
            return zoijcleaowVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object ageimvtcrz(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List b(SQLiteDatabase sQLiteDatabase) {
        return (List) a0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new zoijcleaow() { // from class: y9.hcddaimhww
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.f((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t9.gxszxtbevo ezmngbhpjk(long j13, Cursor cursor) {
        cursor.moveToNext();
        return t9.gxszxtbevo.ppxfxbqfkf().ppxfxbqfkf(cursor.getLong(0)).zoijcleaow(j13).iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List f(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(q9.rgvfuqvkyq.iobyxmoadg().zoijcleaow(cursor.getString(1)).wkgbmnqykc(ba.iobyxmoadg.zoijcleaow(cursor.getInt(2))).ppxfxbqfkf(T(cursor.getString(3))).iobyxmoadg());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(q9.rgvfuqvkyq rgvfuqvkyqVar, SQLiteDatabase sQLiteDatabase) {
        List listM = M(sQLiteDatabase, rgvfuqvkyqVar, this.f124113iwizpuwonk.wkgbmnqykc());
        for (o9.gxszxtbevo gxszxtbevoVar : o9.gxszxtbevo.values()) {
            if (gxszxtbevoVar != rgvfuqvkyqVar.wkgbmnqykc()) {
                int iWkgbmnqykc = this.f124113iwizpuwonk.wkgbmnqykc() - listM.size();
                if (iWkgbmnqykc <= 0) {
                    break;
                }
                listM.addAll(M(sQLiteDatabase, rgvfuqvkyqVar.gxszxtbevo(gxszxtbevoVar), iWkgbmnqykc));
            }
        }
        return uawqvzlxes(listM, O(sQLiteDatabase, listM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object hszhottldk(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t9.iobyxmoadg i(Map map, t9.iobyxmoadg.C2702iobyxmoadg c2702iobyxmoadg, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            t9.ppxfxbqfkf.zoijcleaow zoijcleaowVarJlmebxxoox = jlmebxxoox(cursor.getInt(1));
            long j13 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(t9.ppxfxbqfkf.ppxfxbqfkf().ppxfxbqfkf(zoijcleaowVarJlmebxxoox).zoijcleaow(j13).iobyxmoadg());
        }
        V(c2702iobyxmoadg, map);
        return c2702iobyxmoadg.eablkybsjg(iyctptxqzt()).wkgbmnqykc(yfnezrywwk()).ppxfxbqfkf((String) this.f124112cqumvgiudr.get()).zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase ipoelvxyzq(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    private t9.gxszxtbevo iyctptxqzt() {
        final long jWflxmlrfwp = this.f124115yggfygwlhe.wflxmlrfwp();
        return (t9.gxszxtbevo) nuxfzjnpeb(new zoijcleaow() { // from class: y9.istkbnxepw
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.rhgxfdycjh(jWflxmlrfwp, (SQLiteDatabase) obj);
            }
        });
    }

    private t9.ppxfxbqfkf.zoijcleaow jlmebxxoox(int i13) {
        t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar = t9.ppxfxbqfkf.zoijcleaow.REASON_UNKNOWN;
        if (i13 == zoijcleaowVar.getNumber()) {
            return zoijcleaowVar;
        }
        t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar2 = t9.ppxfxbqfkf.zoijcleaow.MESSAGE_TOO_OLD;
        if (i13 == zoijcleaowVar2.getNumber()) {
            return zoijcleaowVar2;
        }
        t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar3 = t9.ppxfxbqfkf.zoijcleaow.CACHE_FULL;
        if (i13 == zoijcleaowVar3.getNumber()) {
            return zoijcleaowVar3;
        }
        t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar4 = t9.ppxfxbqfkf.zoijcleaow.PAYLOAD_TOO_BIG;
        if (i13 == zoijcleaowVar4.getNumber()) {
            return zoijcleaowVar4;
        }
        t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar5 = t9.ppxfxbqfkf.zoijcleaow.MAX_RETRIES_REACHED;
        if (i13 == zoijcleaowVar5.getNumber()) {
            return zoijcleaowVar5;
        }
        t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar6 = t9.ppxfxbqfkf.zoijcleaow.INVALID_PAYLOD;
        if (i13 == zoijcleaowVar6.getNumber()) {
            return zoijcleaowVar6;
        }
        t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar7 = t9.ppxfxbqfkf.zoijcleaow.SERVER_ERROR;
        if (i13 == zoijcleaowVar7.getNumber()) {
            return zoijcleaowVar7;
        }
        u9.iobyxmoadg.iobyxmoadg("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
        return zoijcleaowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long krqnebusok(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lxfrhoxuzk(Cursor cursor) {
        while (cursor.moveToNext()) {
            iobyxmoadg(cursor.getInt(0), t9.ppxfxbqfkf.zoijcleaow.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t9.iobyxmoadg m(String str, final Map map, final t9.iobyxmoadg.C2702iobyxmoadg c2702iobyxmoadg, SQLiteDatabase sQLiteDatabase) {
        return (t9.iobyxmoadg) a0(sQLiteDatabase.rawQuery(str, new String[0]), new zoijcleaow() { // from class: y9.pmvmpeiblj
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124145iobyxmoadg.i(map, c2702iobyxmoadg, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long mhtqkkgtqm(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private void okpsazkaxt(final SQLiteDatabase sQLiteDatabase) {
        X(new wkgbmnqykc() { // from class: y9.draadjrbmk
            @Override // y9.hkdspvbjdz.wkgbmnqykc
            public final Object iobyxmoadg() {
                return hkdspvbjdz.hszhottldk(sQLiteDatabase);
            }
        }, new zoijcleaow() { // from class: y9.iwizpuwonk
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.ageimvtcrz((Throwable) obj);
            }
        });
    }

    private long opjhrmiecq() {
        return czzsidtyhn().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(List list, q9.rgvfuqvkyq rgvfuqvkyqVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j13 = cursor.getLong(0);
            boolean z13 = cursor.getInt(7) != 0;
            q9.dxjokdxxww.iobyxmoadg iobyxmoadgVarOjitshcjhn = q9.dxjokdxxww.iobyxmoadg().agtfadlqog(cursor.getString(1)).dxjokdxxww(cursor.getLong(2)).ojitshcjhn(cursor.getLong(3));
            if (z13) {
                iobyxmoadgVarOjitshcjhn.nufgyqmvbu(new q9.nufgyqmvbu(Y(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                iobyxmoadgVarOjitshcjhn.nufgyqmvbu(new q9.nufgyqmvbu(Y(cursor.getString(4)), W(j13)));
            }
            if (!cursor.isNull(6)) {
                iobyxmoadgVarOjitshcjhn.lqeggnwhkg(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                iobyxmoadgVarOjitshcjhn.draadjrbmk(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                iobyxmoadgVarOjitshcjhn.wflxmlrfwp(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                iobyxmoadgVarOjitshcjhn.btonecajqb(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                iobyxmoadgVarOjitshcjhn.gtknphoqwx(cursor.getBlob(11));
            }
            list.add(gtknphoqwx.iobyxmoadg(j13, rgvfuqvkyqVar, iobyxmoadgVarOjitshcjhn.wkgbmnqykc()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j13 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j13));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j13), hashSet);
            }
            hashSet.add(new ppxfxbqfkf(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t9.gxszxtbevo rhgxfdycjh(final long j13, SQLiteDatabase sQLiteDatabase) {
        return (t9.gxszxtbevo) a0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new zoijcleaow() { // from class: y9.cdpycssgdh
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.ezmngbhpjk(j13, (Cursor) obj);
            }
        });
    }

    private boolean tbqsvytpvh() {
        return zfvoamnweg() * opjhrmiecq() >= this.f124113iwizpuwonk.gxszxtbevo();
    }

    private List uawqvzlxes(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) listIterator.next();
            if (map.containsKey(Long.valueOf(gtknphoqwxVar.ppxfxbqfkf()))) {
                q9.dxjokdxxww.iobyxmoadg iobyxmoadgVarRgvfuqvkyq = gtknphoqwxVar.zoijcleaow().rgvfuqvkyq();
                for (ppxfxbqfkf ppxfxbqfkfVar : (Set) map.get(Long.valueOf(gtknphoqwxVar.ppxfxbqfkf()))) {
                    iobyxmoadgVarRgvfuqvkyq.ppxfxbqfkf(ppxfxbqfkfVar.f124117iobyxmoadg, ppxfxbqfkfVar.f124118zoijcleaow);
                }
                listIterator.set(gtknphoqwx.iobyxmoadg(gtknphoqwxVar.ppxfxbqfkf(), gtknphoqwxVar.wkgbmnqykc(), iobyxmoadgVarRgvfuqvkyq.wkgbmnqykc()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long v(q9.dxjokdxxww dxjokdxxwwVar, q9.rgvfuqvkyq rgvfuqvkyqVar, SQLiteDatabase sQLiteDatabase) {
        if (tbqsvytpvh()) {
            iobyxmoadg(1L, t9.ppxfxbqfkf.zoijcleaow.CACHE_FULL, dxjokdxxwwVar.agtfadlqog());
            return -1L;
        }
        long jXrmfcynszj = xrmfcynszj(sQLiteDatabase, rgvfuqvkyqVar);
        int iEablkybsjg = this.f124113iwizpuwonk.eablkybsjg();
        byte[] bArrIobyxmoadg = dxjokdxxwwVar.eablkybsjg().iobyxmoadg();
        boolean z13 = bArrIobyxmoadg.length <= iEablkybsjg;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jXrmfcynszj));
        contentValues.put("transport_name", dxjokdxxwwVar.agtfadlqog());
        contentValues.put("timestamp_ms", Long.valueOf(dxjokdxxwwVar.gxszxtbevo()));
        contentValues.put("uptime_ms", Long.valueOf(dxjokdxxwwVar.ojitshcjhn()));
        contentValues.put("payload_encoding", dxjokdxxwwVar.eablkybsjg().zoijcleaow().iobyxmoadg());
        contentValues.put("code", dxjokdxxwwVar.wkgbmnqykc());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z13));
        contentValues.put("payload", z13 ? bArrIobyxmoadg : new byte[0]);
        contentValues.put("product_id", dxjokdxxwwVar.draadjrbmk());
        contentValues.put("pseudonymous_id", dxjokdxxwwVar.wflxmlrfwp());
        contentValues.put("experiment_ids_clear_blob", dxjokdxxwwVar.lqeggnwhkg());
        contentValues.put("experiment_ids_encrypted_blob", dxjokdxxwwVar.nufgyqmvbu());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z13) {
            int iCeil = (int) Math.ceil(((double) bArrIobyxmoadg.length) / ((double) iEablkybsjg));
            for (int i13 = 1; i13 <= iCeil; i13++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrIobyxmoadg, (i13 - 1) * iEablkybsjg, Math.min(i13 * iEablkybsjg, bArrIobyxmoadg.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i13));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : dxjokdxxwwVar.gtknphoqwx().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put(ExternalMetricsManagerImpl.NAME, (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] w(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            byte[] bArr2 = (byte[]) arrayList.get(i13);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private Long weqkydbzbr(SQLiteDatabase sQLiteDatabase, q9.rgvfuqvkyq rgvfuqvkyqVar) {
        StringBuilder sb3 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(rgvfuqvkyqVar.zoijcleaow(), String.valueOf(ba.iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar.wkgbmnqykc()))));
        if (rgvfuqvkyqVar.ppxfxbqfkf() != null) {
            sb3.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(rgvfuqvkyqVar.ppxfxbqfkf(), 0));
        } else {
            sb3.append(" and extras is null");
        }
        return (Long) a0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb3.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new zoijcleaow() { // from class: y9.agtfadlqog
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.krqnebusok((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer wizcaqwiak(long j13, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j13)};
        a0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new zoijcleaow() { // from class: y9.kcexrzcfyt
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124134iobyxmoadg.lxfrhoxuzk((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    private long xrmfcynszj(SQLiteDatabase sQLiteDatabase, q9.rgvfuqvkyq rgvfuqvkyqVar) {
        Long lWeqkydbzbr = weqkydbzbr(sQLiteDatabase, rgvfuqvkyqVar);
        if (lWeqkydbzbr != null) {
            return lWeqkydbzbr.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", rgvfuqvkyqVar.zoijcleaow());
        contentValues.put("priority", Integer.valueOf(ba.iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar.wkgbmnqykc())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (rgvfuqvkyqVar.ppxfxbqfkf() != null) {
            contentValues.put("extras", Base64.encodeToString(rgvfuqvkyqVar.ppxfxbqfkf(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private t9.zoijcleaow yfnezrywwk() {
        return t9.zoijcleaow.zoijcleaow().zoijcleaow(t9.eablkybsjg.ppxfxbqfkf().zoijcleaow(rlfsiqarku()).ppxfxbqfkf(eablkybsjg.f124110iobyxmoadg.gxszxtbevo()).iobyxmoadg()).iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object z(Cursor cursor) {
        while (cursor.moveToNext()) {
            iobyxmoadg(cursor.getInt(0), t9.ppxfxbqfkf.zoijcleaow.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private long zfvoamnweg() {
        return czzsidtyhn().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // y9.wkgbmnqykc
    public boolean G(final q9.rgvfuqvkyq rgvfuqvkyqVar) {
        return ((Boolean) nuxfzjnpeb(new zoijcleaow() { // from class: y9.ojitshcjhn
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124138iobyxmoadg.a(rgvfuqvkyqVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // y9.wkgbmnqykc
    public gtknphoqwx bfopjjpdmp(final q9.rgvfuqvkyq rgvfuqvkyqVar, final q9.dxjokdxxww dxjokdxxwwVar) {
        u9.iobyxmoadg.zoijcleaow("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", rgvfuqvkyqVar.wkgbmnqykc(), dxjokdxxwwVar.agtfadlqog(), rgvfuqvkyqVar.zoijcleaow());
        long jLongValue = ((Long) nuxfzjnpeb(new zoijcleaow() { // from class: y9.ylkuphrtab
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124169iobyxmoadg.v(dxjokdxxwwVar, rgvfuqvkyqVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return gtknphoqwx.iobyxmoadg(jLongValue, rgvfuqvkyqVar, dxjokdxxwwVar);
    }

    @Override // y9.wkgbmnqykc
    public long c(q9.rgvfuqvkyq rgvfuqvkyqVar) {
        return ((Long) a0(czzsidtyhn().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rgvfuqvkyqVar.zoijcleaow(), String.valueOf(ba.iobyxmoadg.iobyxmoadg(rgvfuqvkyqVar.wkgbmnqykc()))}), new zoijcleaow() { // from class: y9.wwaezpbzkn
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.mhtqkkgtqm((Cursor) obj);
            }
        })).longValue();
    }

    @Override // y9.wkgbmnqykc
    public Iterable cllcsxoeiz(final q9.rgvfuqvkyq rgvfuqvkyqVar) {
        return (Iterable) nuxfzjnpeb(new zoijcleaow() { // from class: y9.wflxmlrfwp
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124166iobyxmoadg.g(rgvfuqvkyqVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f124116zdlpuopuiu.close();
    }

    SQLiteDatabase czzsidtyhn() {
        final ulzqkzuiru ulzqkzuiruVar = this.f124116zdlpuopuiu;
        Objects.requireNonNull(ulzqkzuiruVar);
        return (SQLiteDatabase) X(new wkgbmnqykc() { // from class: y9.yadqdtsiqt
            @Override // y9.hkdspvbjdz.wkgbmnqykc
            public final Object iobyxmoadg() {
                return ulzqkzuiruVar.getWritableDatabase();
            }
        }, new zoijcleaow() { // from class: y9.iozdgvuglv
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.ipoelvxyzq((Throwable) obj);
            }
        });
    }

    @Override // y9.wkgbmnqykc
    public void esjtqupxsv(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            czzsidtyhn().compileStatement("DELETE FROM events WHERE _id in " + Z(iterable)).execute();
        }
    }

    @Override // y9.wkgbmnqykc
    public void fyldjkxazc(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Z(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            nuxfzjnpeb(new zoijcleaow() { // from class: y9.jpowsppfya
                @Override // y9.hkdspvbjdz.zoijcleaow
                public final Object apply(Object obj) {
                    return this.f124130iobyxmoadg.A(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // y9.ppxfxbqfkf
    public void iobyxmoadg(final long j13, final t9.ppxfxbqfkf.zoijcleaow zoijcleaowVar, final String str) {
        nuxfzjnpeb(new zoijcleaow() { // from class: y9.oxmwwwfdhm
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.D(str, zoijcleaowVar, j13, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // y9.wkgbmnqykc
    public int iwizpuwonk() {
        final long jWflxmlrfwp = this.f124115yggfygwlhe.wflxmlrfwp() - this.f124113iwizpuwonk.ppxfxbqfkf();
        return ((Integer) nuxfzjnpeb(new zoijcleaow() { // from class: y9.pkzmftpjix
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124143iobyxmoadg.wizcaqwiak(jWflxmlrfwp, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // z9.iobyxmoadg
    public Object lqeggnwhkg(z9.iobyxmoadg.InterfaceC3287iobyxmoadg interfaceC3287iobyxmoadg) {
        SQLiteDatabase sQLiteDatabaseCzzsidtyhn = czzsidtyhn();
        okpsazkaxt(sQLiteDatabaseCzzsidtyhn);
        try {
            Object objExecute = interfaceC3287iobyxmoadg.execute();
            sQLiteDatabaseCzzsidtyhn.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseCzzsidtyhn.endTransaction();
        }
    }

    @Override // y9.ppxfxbqfkf
    public t9.iobyxmoadg nufgyqmvbu() {
        final t9.iobyxmoadg.C2702iobyxmoadg c2702iobyxmoadgEablkybsjg = t9.iobyxmoadg.eablkybsjg();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (t9.iobyxmoadg) nuxfzjnpeb(new zoijcleaow() { // from class: y9.zdlpuopuiu
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124172iobyxmoadg.m(str, map, c2702iobyxmoadgEablkybsjg, (SQLiteDatabase) obj);
            }
        });
    }

    Object nuxfzjnpeb(zoijcleaow zoijcleaowVar) {
        SQLiteDatabase sQLiteDatabaseCzzsidtyhn = czzsidtyhn();
        sQLiteDatabaseCzzsidtyhn.beginTransaction();
        try {
            Object objApply = zoijcleaowVar.apply(sQLiteDatabaseCzzsidtyhn);
            sQLiteDatabaseCzzsidtyhn.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseCzzsidtyhn.endTransaction();
        }
    }

    @Override // y9.wkgbmnqykc
    public void p(final q9.rgvfuqvkyq rgvfuqvkyqVar, final long j13) {
        nuxfzjnpeb(new zoijcleaow() { // from class: y9.rgvfuqvkyq
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.J(j13, rgvfuqvkyqVar, (SQLiteDatabase) obj);
            }
        });
    }

    long rlfsiqarku() {
        return zfvoamnweg() * opjhrmiecq();
    }

    @Override // y9.wkgbmnqykc
    public Iterable stevsuqkhv() {
        return (Iterable) nuxfzjnpeb(new zoijcleaow() { // from class: y9.lmojexxdyd
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return hkdspvbjdz.b((SQLiteDatabase) obj);
            }
        });
    }

    @Override // y9.ppxfxbqfkf
    public void wkgbmnqykc() {
        nuxfzjnpeb(new zoijcleaow() { // from class: y9.vdvldrhtss
            @Override // y9.hkdspvbjdz.zoijcleaow
            public final Object apply(Object obj) {
                return this.f124165iobyxmoadg.L((SQLiteDatabase) obj);
            }
        });
    }
}
