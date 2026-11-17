package ru.myspar.proloyalty.common.view.bottomsheet.additional_info;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f93854iobyxmoadg;

        public iobyxmoadg(float f13) {
            this.f93854iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && Float.compare(this.f93854iobyxmoadg, ((iobyxmoadg) obj).f93854iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f93854iobyxmoadg);
        }

        public final float iobyxmoadg() {
            return this.f93854iobyxmoadg;
        }

        public String toString() {
            return "FitIntoOneLine(minFontSizeForMessages=" + this.f93854iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2215zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f93855ppxfxbqfkf = 0;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f93856iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f93857zoijcleaow;

        public C2215zoijcleaow(float f13, int i13) {
            this.f93856iobyxmoadg = f13;
            this.f93857zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2215zoijcleaow)) {
                return false;
            }
            C2215zoijcleaow c2215zoijcleaow = (C2215zoijcleaow) obj;
            return Float.compare(this.f93856iobyxmoadg, c2215zoijcleaow.f93856iobyxmoadg) == 0 && this.f93857zoijcleaow == c2215zoijcleaow.f93857zoijcleaow;
        }

        public int hashCode() {
            return (Float.hashCode(this.f93856iobyxmoadg) * 31) + Integer.hashCode(this.f93857zoijcleaow);
        }

        public final float iobyxmoadg() {
            return this.f93856iobyxmoadg;
        }

        public String toString() {
            return "LimitNumberOfLine(fontSizeForMessages=" + this.f93856iobyxmoadg + ", maxLinesForMessages=" + this.f93857zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f93857zoijcleaow;
        }
    }
}
