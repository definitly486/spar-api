package n5;

import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe implements u5.btonecajqb, u5.dxjokdxxww {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final String[] f68928cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final byte[][] f68929esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final double[] f68930iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final long[] f68931jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int[] f68932lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f68933pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile String f68934yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f68935zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final iobyxmoadg f68927zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final TreeMap f68926istkbnxepw = new TreeMap();

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final yggfygwlhe iobyxmoadg(String query, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            TreeMap treeMap = yggfygwlhe.f68926istkbnxepw;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i13));
                if (entryCeilingEntry == null) {
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    yggfygwlhe yggfygwlheVar = new yggfygwlhe(i13, null);
                    yggfygwlheVar.dxjokdxxww(query, i13);
                    return yggfygwlheVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                yggfygwlhe sqliteQuery = (yggfygwlhe) entryCeilingEntry.getValue();
                sqliteQuery.dxjokdxxww(query, i13);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void zoijcleaow() {
            TreeMap treeMap = yggfygwlhe.f68926istkbnxepw;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i13 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i13;
            }
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ yggfygwlhe(int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13);
    }

    public static final yggfygwlhe lqeggnwhkg(String str, int i13) {
        return f68927zynmafqrjb.iobyxmoadg(str, i13);
    }

    @Override // u5.dxjokdxxww
    public void N(int i13) {
        this.f68932lereixgezr[i13] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void dxjokdxxww(String query, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
        this.f68934yggfygwlhe = query;
        this.f68933pmvmpeiblj = i13;
    }

    @Override // u5.dxjokdxxww
    public void e(int i13, String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f68932lereixgezr[i13] = 4;
        this.f68928cqumvgiudr[i13] = value;
    }

    @Override // u5.btonecajqb
    public void iobyxmoadg(u5.dxjokdxxww statement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(statement, "statement");
        int iNufgyqmvbu = nufgyqmvbu();
        if (1 > iNufgyqmvbu) {
            return;
        }
        int i13 = 1;
        while (true) {
            int i14 = this.f68932lereixgezr[i13];
            if (i14 == 1) {
                statement.N(i13);
            } else if (i14 == 2) {
                statement.s(i13, this.f68931jyumaefscl[i13]);
            } else if (i14 == 3) {
                statement.jpowsppfya(i13, this.f68930iwizpuwonk[i13]);
            } else if (i14 == 4) {
                String str = this.f68928cqumvgiudr[i13];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.e(i13, str);
            } else if (i14 == 5) {
                byte[] bArr = this.f68929esjtqupxsv[i13];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.y(i13, bArr);
            }
            if (i13 == iNufgyqmvbu) {
                return;
            } else {
                i13++;
            }
        }
    }

    @Override // u5.dxjokdxxww
    public void jpowsppfya(int i13, double d13) {
        this.f68932lereixgezr[i13] = 3;
        this.f68930iwizpuwonk[i13] = d13;
    }

    public int nufgyqmvbu() {
        return this.f68933pmvmpeiblj;
    }

    public final void release() {
        TreeMap treeMap = f68926istkbnxepw;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f68935zdlpuopuiu), this);
            f68927zynmafqrjb.zoijcleaow();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // u5.dxjokdxxww
    public void s(int i13, long j13) {
        this.f68932lereixgezr[i13] = 2;
        this.f68931jyumaefscl[i13] = j13;
    }

    @Override // u5.btonecajqb
    public String wkgbmnqykc() {
        String str = this.f68934yggfygwlhe;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // u5.dxjokdxxww
    public void y(int i13, byte[] value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f68932lereixgezr[i13] = 5;
        this.f68929esjtqupxsv[i13] = value;
    }

    private yggfygwlhe(int i13) {
        this.f68935zdlpuopuiu = i13;
        int i14 = i13 + 1;
        this.f68932lereixgezr = new int[i14];
        this.f68931jyumaefscl = new long[i14];
        this.f68930iwizpuwonk = new double[i14];
        this.f68928cqumvgiudr = new String[i14];
        this.f68929esjtqupxsv = new byte[i14][];
    }
}
