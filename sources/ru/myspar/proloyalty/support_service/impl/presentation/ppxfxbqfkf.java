package ru.myspar.proloyalty.support_service.impl.presentation;

import fv1.gxszxtbevo;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f101859iobyxmoadg;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.support_service.impl.presentation.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2449iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final boolean f101860iobyxmoadg;

            public C2449iobyxmoadg(boolean z13) {
                this.f101860iobyxmoadg = z13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2449iobyxmoadg) && this.f101860iobyxmoadg == ((C2449iobyxmoadg) obj).f101860iobyxmoadg;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f101860iobyxmoadg);
            }

            public final boolean iobyxmoadg() {
                return this.f101860iobyxmoadg;
            }

            public String toString() {
                return "Error(isLoading=" + this.f101860iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.support_service.impl.presentation.ppxfxbqfkf$iobyxmoadg$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C2450ppxfxbqfkf implements iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private final gxszxtbevo f101861eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f101862iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f101863ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final fv1.ppxfxbqfkf f101864wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f101865zoijcleaow;

            public C2450ppxfxbqfkf(String topIconUrl, String title, String subtitle, fv1.ppxfxbqfkf actions, gxszxtbevo faqItems) {
                zdlpuopuiu.btonecajqb(topIconUrl, "topIconUrl");
                zdlpuopuiu.btonecajqb(title, "title");
                zdlpuopuiu.btonecajqb(subtitle, "subtitle");
                zdlpuopuiu.btonecajqb(actions, "actions");
                zdlpuopuiu.btonecajqb(faqItems, "faqItems");
                this.f101862iobyxmoadg = topIconUrl;
                this.f101865zoijcleaow = title;
                this.f101863ppxfxbqfkf = subtitle;
                this.f101864wkgbmnqykc = actions;
                this.f101861eablkybsjg = faqItems;
            }

            public final String eablkybsjg() {
                return this.f101862iobyxmoadg;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2450ppxfxbqfkf)) {
                    return false;
                }
                C2450ppxfxbqfkf c2450ppxfxbqfkf = (C2450ppxfxbqfkf) obj;
                return zdlpuopuiu.eablkybsjg(this.f101862iobyxmoadg, c2450ppxfxbqfkf.f101862iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101865zoijcleaow, c2450ppxfxbqfkf.f101865zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f101863ppxfxbqfkf, c2450ppxfxbqfkf.f101863ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f101864wkgbmnqykc, c2450ppxfxbqfkf.f101864wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f101861eablkybsjg, c2450ppxfxbqfkf.f101861eablkybsjg);
            }

            public int hashCode() {
                return (((((((this.f101862iobyxmoadg.hashCode() * 31) + this.f101865zoijcleaow.hashCode()) * 31) + this.f101863ppxfxbqfkf.hashCode()) * 31) + this.f101864wkgbmnqykc.hashCode()) * 31) + this.f101861eablkybsjg.hashCode();
            }

            public final fv1.ppxfxbqfkf iobyxmoadg() {
                return this.f101864wkgbmnqykc;
            }

            public final String ppxfxbqfkf() {
                return this.f101863ppxfxbqfkf;
            }

            public String toString() {
                return "Success(topIconUrl=" + this.f101862iobyxmoadg + ", title=" + this.f101865zoijcleaow + ", subtitle=" + this.f101863ppxfxbqfkf + ", actions=" + this.f101864wkgbmnqykc + ", faqItems=" + this.f101861eablkybsjg + ")";
            }

            public final String wkgbmnqykc() {
                return this.f101865zoijcleaow;
            }

            public final gxszxtbevo zoijcleaow() {
                return this.f101861eablkybsjg;
            }
        }

        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f101866iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return -1134831110;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    public ppxfxbqfkf(iobyxmoadg content) {
        zdlpuopuiu.btonecajqb(content, "content");
        this.f101859iobyxmoadg = content;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f101859iobyxmoadg, ((ppxfxbqfkf) obj).f101859iobyxmoadg);
    }

    public int hashCode() {
        return this.f101859iobyxmoadg.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f101859iobyxmoadg;
    }

    public String toString() {
        return "Model(content=" + this.f101859iobyxmoadg + ")";
    }
}
