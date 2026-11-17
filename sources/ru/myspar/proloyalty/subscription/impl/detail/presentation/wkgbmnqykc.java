package ru.myspar.proloyalty.subscription.impl.detail.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f101781iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f101781iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101781iobyxmoadg, ((iobyxmoadg) obj).f101781iobyxmoadg);
        }

        public int hashCode() {
            return this.f101781iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f101781iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f101781iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101782iobyxmoadg;

        public zoijcleaow(String surveyUrl) {
            zdlpuopuiu.btonecajqb(surveyUrl, "surveyUrl");
            this.f101782iobyxmoadg = surveyUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f101782iobyxmoadg, ((zoijcleaow) obj).f101782iobyxmoadg);
        }

        public int hashCode() {
            return this.f101782iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101782iobyxmoadg;
        }

        public String toString() {
            return "ShowSubscriptionSurvey(surveyUrl=" + this.f101782iobyxmoadg + ")";
        }
    }
}
