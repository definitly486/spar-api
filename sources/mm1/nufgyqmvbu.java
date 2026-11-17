package mm1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f67514iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f67515zoijcleaow;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: mm1.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1395iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C1395iobyxmoadg f67516iobyxmoadg = new C1395iobyxmoadg();

            private C1395iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1395iobyxmoadg);
            }

            public int hashCode() {
                return 753248902;
            }

            public String toString() {
                return "Loading";
            }
        }

        public interface zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: mm1.nufgyqmvbu$iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1396iobyxmoadg implements zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final om1.iobyxmoadg f67517iobyxmoadg;

                /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
                private final String f67518zoijcleaow;

                public C1396iobyxmoadg(om1.iobyxmoadg button, String message) {
                    zdlpuopuiu.btonecajqb(button, "button");
                    zdlpuopuiu.btonecajqb(message, "message");
                    this.f67517iobyxmoadg = button;
                    this.f67518zoijcleaow = message;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1396iobyxmoadg)) {
                        return false;
                    }
                    C1396iobyxmoadg c1396iobyxmoadg = (C1396iobyxmoadg) obj;
                    return zdlpuopuiu.eablkybsjg(this.f67517iobyxmoadg, c1396iobyxmoadg.f67517iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67518zoijcleaow, c1396iobyxmoadg.f67518zoijcleaow);
                }

                public int hashCode() {
                    return (this.f67517iobyxmoadg.hashCode() * 31) + this.f67518zoijcleaow.hashCode();
                }

                @Override // mm1.nufgyqmvbu.iobyxmoadg.zoijcleaow
                public om1.iobyxmoadg iobyxmoadg() {
                    return this.f67517iobyxmoadg;
                }

                public String toString() {
                    return "Error(button=" + this.f67517iobyxmoadg + ", message=" + this.f67518zoijcleaow + ")";
                }

                public final String zoijcleaow() {
                    return this.f67518zoijcleaow;
                }
            }

            /* JADX INFO: renamed from: mm1.nufgyqmvbu$iobyxmoadg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
            public static final class C1397zoijcleaow implements zoijcleaow {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final om1.ppxfxbqfkf f67519iobyxmoadg;

                /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
                private final om1.iobyxmoadg f67520zoijcleaow;

                public C1397zoijcleaow(om1.ppxfxbqfkf item, om1.iobyxmoadg button) {
                    zdlpuopuiu.btonecajqb(item, "item");
                    zdlpuopuiu.btonecajqb(button, "button");
                    this.f67519iobyxmoadg = item;
                    this.f67520zoijcleaow = button;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1397zoijcleaow)) {
                        return false;
                    }
                    C1397zoijcleaow c1397zoijcleaow = (C1397zoijcleaow) obj;
                    return zdlpuopuiu.eablkybsjg(this.f67519iobyxmoadg, c1397zoijcleaow.f67519iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67520zoijcleaow, c1397zoijcleaow.f67520zoijcleaow);
                }

                public int hashCode() {
                    return (this.f67519iobyxmoadg.hashCode() * 31) + this.f67520zoijcleaow.hashCode();
                }

                @Override // mm1.nufgyqmvbu.iobyxmoadg.zoijcleaow
                public om1.iobyxmoadg iobyxmoadg() {
                    return this.f67520zoijcleaow;
                }

                public String toString() {
                    return "Product(item=" + this.f67519iobyxmoadg + ", button=" + this.f67520zoijcleaow + ")";
                }

                public final om1.ppxfxbqfkf zoijcleaow() {
                    return this.f67519iobyxmoadg;
                }
            }

            om1.iobyxmoadg iobyxmoadg();
        }
    }

    public nufgyqmvbu(iobyxmoadg content, String str) {
        zdlpuopuiu.btonecajqb(content, "content");
        this.f67514iobyxmoadg = content;
        this.f67515zoijcleaow = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f67514iobyxmoadg, nufgyqmvbuVar.f67514iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67515zoijcleaow, nufgyqmvbuVar.f67515zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f67514iobyxmoadg.hashCode() * 31;
        String str = this.f67515zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f67514iobyxmoadg;
    }

    public String toString() {
        return "Model(content=" + this.f67514iobyxmoadg + ", snackBar=" + this.f67515zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f67515zoijcleaow;
    }
}
