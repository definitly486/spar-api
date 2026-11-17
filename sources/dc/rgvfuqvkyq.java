package dc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class rgvfuqvkyq extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f27745eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27746iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f27747ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf f27748wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27749zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f27750eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private byte f27751gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27752iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private List f27753ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf f27754wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27755zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg eablkybsjg(String str) {
            this.f27755zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg gxszxtbevo(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f27752iobyxmoadg = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf iobyxmoadg() {
            String str;
            List list;
            if (this.f27751gxszxtbevo == 1 && (str = this.f27752iobyxmoadg) != null && (list = this.f27753ppxfxbqfkf) != null) {
                return new rgvfuqvkyq(str, this.f27755zoijcleaow, list, this.f27754wkgbmnqykc, this.f27750eablkybsjg);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27752iobyxmoadg == null) {
                sb3.append(" type");
            }
            if (this.f27753ppxfxbqfkf == null) {
                sb3.append(" frames");
            }
            if ((1 & this.f27751gxszxtbevo) == 0) {
                sb3.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg ppxfxbqfkf(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f27753ppxfxbqfkf = list;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg wkgbmnqykc(int i13) {
            this.f27750eablkybsjg = i13;
            this.f27751gxszxtbevo = (byte) (this.f27751gxszxtbevo | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg zoijcleaow(iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f27754wkgbmnqykc = ppxfxbqfkfVar;
            return this;
        }
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf
    public String eablkybsjg() {
        return this.f27749zoijcleaow;
    }

    public boolean equals(Object obj) {
        String str;
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar2 = (iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf) obj;
        return this.f27746iobyxmoadg.equals(ppxfxbqfkfVar2.gxszxtbevo()) && ((str = this.f27749zoijcleaow) != null ? str.equals(ppxfxbqfkfVar2.eablkybsjg()) : ppxfxbqfkfVar2.eablkybsjg() == null) && this.f27747ppxfxbqfkf.equals(ppxfxbqfkfVar2.ppxfxbqfkf()) && ((ppxfxbqfkfVar = this.f27748wkgbmnqykc) != null ? ppxfxbqfkfVar.equals(ppxfxbqfkfVar2.zoijcleaow()) : ppxfxbqfkfVar2.zoijcleaow() == null) && this.f27745eablkybsjg == ppxfxbqfkfVar2.wkgbmnqykc();
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf
    public String gxszxtbevo() {
        return this.f27746iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = (this.f27746iobyxmoadg.hashCode() ^ 1000003) * 1000003;
        String str = this.f27749zoijcleaow;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f27747ppxfxbqfkf.hashCode()) * 1000003;
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = this.f27748wkgbmnqykc;
        return ((iHashCode2 ^ (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0)) * 1000003) ^ this.f27745eablkybsjg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf
    public List ppxfxbqfkf() {
        return this.f27747ppxfxbqfkf;
    }

    public String toString() {
        return "Exception{type=" + this.f27746iobyxmoadg + ", reason=" + this.f27749zoijcleaow + ", frames=" + this.f27747ppxfxbqfkf + ", causedBy=" + this.f27748wkgbmnqykc + ", overflowCount=" + this.f27745eablkybsjg + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf
    public int wkgbmnqykc() {
        return this.f27745eablkybsjg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf
    public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf zoijcleaow() {
        return this.f27748wkgbmnqykc;
    }

    private rgvfuqvkyq(String str, String str2, List list, iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        this.f27746iobyxmoadg = str;
        this.f27749zoijcleaow = str2;
        this.f27747ppxfxbqfkf = list;
        this.f27748wkgbmnqykc = ppxfxbqfkfVar;
        this.f27745eablkybsjg = i13;
    }
}
