package v02;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f115065iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f115066zoijcleaow;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: v02.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2864iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C2864iobyxmoadg f115067iobyxmoadg = new C2864iobyxmoadg();

            private C2864iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2864iobyxmoadg);
            }

            public int hashCode() {
                return 1430730313;
            }

            public String toString() {
                return "Loading";
            }
        }

        public interface zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: v02.nufgyqmvbu$iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2865iobyxmoadg implements zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final x02.iobyxmoadg f115068iobyxmoadg;

                /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
                private final String f115069zoijcleaow;

                public C2865iobyxmoadg(x02.iobyxmoadg button, String message) {
                    zdlpuopuiu.btonecajqb(button, "button");
                    zdlpuopuiu.btonecajqb(message, "message");
                    this.f115068iobyxmoadg = button;
                    this.f115069zoijcleaow = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2865iobyxmoadg)) {
                        return false;
                    }
                    C2865iobyxmoadg c2865iobyxmoadg = (C2865iobyxmoadg) obj;
                    return zdlpuopuiu.eablkybsjg(this.f115068iobyxmoadg, c2865iobyxmoadg.f115068iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f115069zoijcleaow, c2865iobyxmoadg.f115069zoijcleaow);
                }

                public int hashCode() {
                    return (this.f115068iobyxmoadg.hashCode() * 31) + this.f115069zoijcleaow.hashCode();
                }

                @Override // v02.nufgyqmvbu.iobyxmoadg.zoijcleaow
                public x02.iobyxmoadg iobyxmoadg() {
                    return this.f115068iobyxmoadg;
                }

                public String toString() {
                    return "Error(button=" + this.f115068iobyxmoadg + ", message=" + this.f115069zoijcleaow + ")";
                }

                public final String zoijcleaow() {
                    return this.f115069zoijcleaow;
                }
            }

            /* JADX INFO: renamed from: v02.nufgyqmvbu$iobyxmoadg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
            public static final class C2866zoijcleaow implements zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final x02.ppxfxbqfkf f115070iobyxmoadg;

                /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
                private final x02.iobyxmoadg f115071zoijcleaow;

                public C2866zoijcleaow(x02.ppxfxbqfkf item, x02.iobyxmoadg button) {
                    zdlpuopuiu.btonecajqb(item, "item");
                    zdlpuopuiu.btonecajqb(button, "button");
                    this.f115070iobyxmoadg = item;
                    this.f115071zoijcleaow = button;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2866zoijcleaow)) {
                        return false;
                    }
                    C2866zoijcleaow c2866zoijcleaow = (C2866zoijcleaow) obj;
                    return zdlpuopuiu.eablkybsjg(this.f115070iobyxmoadg, c2866zoijcleaow.f115070iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f115071zoijcleaow, c2866zoijcleaow.f115071zoijcleaow);
                }

                public int hashCode() {
                    return (this.f115070iobyxmoadg.hashCode() * 31) + this.f115071zoijcleaow.hashCode();
                }

                @Override // v02.nufgyqmvbu.iobyxmoadg.zoijcleaow
                public x02.iobyxmoadg iobyxmoadg() {
                    return this.f115071zoijcleaow;
                }

                public String toString() {
                    return "Product(item=" + this.f115070iobyxmoadg + ", button=" + this.f115071zoijcleaow + ")";
                }

                public final x02.ppxfxbqfkf zoijcleaow() {
                    return this.f115070iobyxmoadg;
                }
            }

            x02.iobyxmoadg iobyxmoadg();
        }
    }

    public nufgyqmvbu(iobyxmoadg content, String str) {
        zdlpuopuiu.btonecajqb(content, "content");
        this.f115065iobyxmoadg = content;
        this.f115066zoijcleaow = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f115065iobyxmoadg, nufgyqmvbuVar.f115065iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f115066zoijcleaow, nufgyqmvbuVar.f115066zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f115065iobyxmoadg.hashCode() * 31;
        String str = this.f115066zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f115065iobyxmoadg;
    }

    public String toString() {
        return "Model(content=" + this.f115065iobyxmoadg + ", snackBar=" + this.f115066zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f115066zoijcleaow;
    }
}
