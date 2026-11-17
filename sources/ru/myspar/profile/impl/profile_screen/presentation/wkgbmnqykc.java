package ru.myspar.profile.impl.profile_screen.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f91752iobyxmoadg;

        public iobyxmoadg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f91752iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91752iobyxmoadg, ((iobyxmoadg) obj).f91752iobyxmoadg);
        }

        public int hashCode() {
            return this.f91752iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f91752iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailVerifyDialog(message=" + this.f91752iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91753iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f91753iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f91753iobyxmoadg, ((zoijcleaow) obj).f91753iobyxmoadg);
        }

        public int hashCode() {
            return this.f91753iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91753iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f91753iobyxmoadg + ")";
        }
    }
}
