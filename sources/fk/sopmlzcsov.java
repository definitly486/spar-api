package fk;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sopmlzcsov extends hkdspvbjdz {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dk.gxszxtbevo f34233ppxfxbqfkf;

    private static final class iobyxmoadg implements Map.Entry, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Object f34234yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f34235zdlpuopuiu;

        public iobyxmoadg(Object obj, Object obj2) {
            this.f34235zdlpuopuiu = obj;
            this.f34234yggfygwlhe = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34235zdlpuopuiu, iobyxmoadgVar.f34235zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34234yggfygwlhe, iobyxmoadgVar.f34234yggfygwlhe);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f34235zdlpuopuiu;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f34234yggfygwlhe;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f34235zdlpuopuiu;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f34234yggfygwlhe;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f34235zdlpuopuiu + ", value=" + this.f34234yggfygwlhe + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sopmlzcsov(final bk.zoijcleaow keySerializer, final bk.zoijcleaow valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keySerializer, "keySerializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(valueSerializer, "valueSerializer");
        this.f34233ppxfxbqfkf = dk.wflxmlrfwp.lqeggnwhkg("kotlin.collections.Map.Entry", dk.ojitshcjhn.ppxfxbqfkf.f29096iobyxmoadg, new dk.gxszxtbevo[0], new tg.draadjrbmk() { // from class: fk.ulzqkzuiru
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return sopmlzcsov.draadjrbmk(keySerializer, valueSerializer, (dk.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(bk.zoijcleaow zoijcleaowVar, bk.zoijcleaow zoijcleaowVar2, dk.iobyxmoadg buildSerialDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buildSerialDescriptor, "$this$buildSerialDescriptor");
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "key", zoijcleaowVar.iobyxmoadg(), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "value", zoijcleaowVar2.iobyxmoadg(), null, false, 12, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.hkdspvbjdz
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public Object nufgyqmvbu(Map.Entry entry) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entry, "<this>");
        return entry.getValue();
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return this.f34233ppxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.hkdspvbjdz
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public Map.Entry btonecajqb(Object obj, Object obj2) {
        return new iobyxmoadg(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.hkdspvbjdz
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public Object gxszxtbevo(Map.Entry entry) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entry, "<this>");
        return entry.getKey();
    }
}
