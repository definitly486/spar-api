package ru.myspar.support_service.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import l92.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f104496iobyxmoadg;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.support_service.impl.presentation.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2527iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final boolean f104497iobyxmoadg;

            public C2527iobyxmoadg(boolean z13) {
                this.f104497iobyxmoadg = z13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2527iobyxmoadg) && this.f104497iobyxmoadg == ((C2527iobyxmoadg) obj).f104497iobyxmoadg;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f104497iobyxmoadg);
            }

            public final boolean iobyxmoadg() {
                return this.f104497iobyxmoadg;
            }

            public String toString() {
                return "Error(isLoading=" + this.f104497iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.support_service.impl.presentation.ppxfxbqfkf$iobyxmoadg$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C2528ppxfxbqfkf implements iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private final gxszxtbevo f104498eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f104499iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f104500ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final l92.ppxfxbqfkf f104501wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f104502zoijcleaow;

            public C2528ppxfxbqfkf(String topIconUrl, String title, String subtitle, l92.ppxfxbqfkf actions, gxszxtbevo faqItems) {
                zdlpuopuiu.btonecajqb(topIconUrl, "topIconUrl");
                zdlpuopuiu.btonecajqb(title, "title");
                zdlpuopuiu.btonecajqb(subtitle, "subtitle");
                zdlpuopuiu.btonecajqb(actions, "actions");
                zdlpuopuiu.btonecajqb(faqItems, "faqItems");
                this.f104499iobyxmoadg = topIconUrl;
                this.f104502zoijcleaow = title;
                this.f104500ppxfxbqfkf = subtitle;
                this.f104501wkgbmnqykc = actions;
                this.f104498eablkybsjg = faqItems;
            }

            public final String eablkybsjg() {
                return this.f104499iobyxmoadg;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2528ppxfxbqfkf)) {
                    return false;
                }
                C2528ppxfxbqfkf c2528ppxfxbqfkf = (C2528ppxfxbqfkf) obj;
                return zdlpuopuiu.eablkybsjg(this.f104499iobyxmoadg, c2528ppxfxbqfkf.f104499iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104502zoijcleaow, c2528ppxfxbqfkf.f104502zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104500ppxfxbqfkf, c2528ppxfxbqfkf.f104500ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104501wkgbmnqykc, c2528ppxfxbqfkf.f104501wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f104498eablkybsjg, c2528ppxfxbqfkf.f104498eablkybsjg);
            }

            public int hashCode() {
                return (((((((this.f104499iobyxmoadg.hashCode() * 31) + this.f104502zoijcleaow.hashCode()) * 31) + this.f104500ppxfxbqfkf.hashCode()) * 31) + this.f104501wkgbmnqykc.hashCode()) * 31) + this.f104498eablkybsjg.hashCode();
            }

            public final l92.ppxfxbqfkf iobyxmoadg() {
                return this.f104501wkgbmnqykc;
            }

            public final String ppxfxbqfkf() {
                return this.f104500ppxfxbqfkf;
            }

            public String toString() {
                return "Success(topIconUrl=" + this.f104499iobyxmoadg + ", title=" + this.f104502zoijcleaow + ", subtitle=" + this.f104500ppxfxbqfkf + ", actions=" + this.f104501wkgbmnqykc + ", faqItems=" + this.f104498eablkybsjg + ")";
            }

            public final String wkgbmnqykc() {
                return this.f104502zoijcleaow;
            }

            public final gxszxtbevo zoijcleaow() {
                return this.f104498eablkybsjg;
            }
        }

        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f104503iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return -1607743849;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    public ppxfxbqfkf(iobyxmoadg content) {
        zdlpuopuiu.btonecajqb(content, "content");
        this.f104496iobyxmoadg = content;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104496iobyxmoadg, ((ppxfxbqfkf) obj).f104496iobyxmoadg);
    }

    public int hashCode() {
        return this.f104496iobyxmoadg.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f104496iobyxmoadg;
    }

    public String toString() {
        return "Model(content=" + this.f104496iobyxmoadg + ")";
    }
}
