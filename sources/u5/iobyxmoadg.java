package u5;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements btonecajqb {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final C2783iobyxmoadg f112687jyumaefscl = new C2783iobyxmoadg(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object[] f112688yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f112689zdlpuopuiu;

    /* JADX INFO: renamed from: u5.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2783iobyxmoadg {
        public /* synthetic */ C2783iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final void iobyxmoadg(dxjokdxxww dxjokdxxwwVar, int i13, Object obj) {
            if (obj == null) {
                dxjokdxxwwVar.N(i13);
                return;
            }
            if (obj instanceof byte[]) {
                dxjokdxxwwVar.y(i13, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                dxjokdxxwwVar.jpowsppfya(i13, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                dxjokdxxwwVar.jpowsppfya(i13, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                dxjokdxxwwVar.s(i13, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                dxjokdxxwwVar.s(i13, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                dxjokdxxwwVar.s(i13, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                dxjokdxxwwVar.s(i13, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                dxjokdxxwwVar.e(i13, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                dxjokdxxwwVar.s(i13, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i13 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void zoijcleaow(dxjokdxxww statement, Object[] objArr) {
            zdlpuopuiu.btonecajqb(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i13 = 0;
            while (i13 < length) {
                Object obj = objArr[i13];
                i13++;
                iobyxmoadg(statement, i13, obj);
            }
        }

        private C2783iobyxmoadg() {
        }
    }

    public iobyxmoadg(String query, Object[] objArr) {
        zdlpuopuiu.btonecajqb(query, "query");
        this.f112689zdlpuopuiu = query;
        this.f112688yggfygwlhe = objArr;
    }

    @Override // u5.btonecajqb
    public void iobyxmoadg(dxjokdxxww statement) {
        zdlpuopuiu.btonecajqb(statement, "statement");
        f112687jyumaefscl.zoijcleaow(statement, this.f112688yggfygwlhe);
    }

    @Override // u5.btonecajqb
    public String wkgbmnqykc() {
        return this.f112689zdlpuopuiu;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(String query) {
        this(query, null);
        zdlpuopuiu.btonecajqb(query, "query");
    }
}
