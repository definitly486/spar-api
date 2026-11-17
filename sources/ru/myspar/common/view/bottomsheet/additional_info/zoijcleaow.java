package ru.myspar.common.view.bottomsheet.additional_info;

/* JADX INFO: loaded from: classes4.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f86120iobyxmoadg;

        public iobyxmoadg(float f13) {
            this.f86120iobyxmoadg = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && Float.compare(this.f86120iobyxmoadg, ((iobyxmoadg) obj).f86120iobyxmoadg) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f86120iobyxmoadg);
        }

        public final float iobyxmoadg() {
            return this.f86120iobyxmoadg;
        }

        public String toString() {
            return "FitIntoOneLine(minFontSizeForMessages=" + this.f86120iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.common.view.bottomsheet.additional_info.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1980zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f86121ppxfxbqfkf = 0;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final float f86122iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f86123zoijcleaow;

        public C1980zoijcleaow(float f13, int i13) {
            this.f86122iobyxmoadg = f13;
            this.f86123zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1980zoijcleaow)) {
                return false;
            }
            C1980zoijcleaow c1980zoijcleaow = (C1980zoijcleaow) obj;
            return Float.compare(this.f86122iobyxmoadg, c1980zoijcleaow.f86122iobyxmoadg) == 0 && this.f86123zoijcleaow == c1980zoijcleaow.f86123zoijcleaow;
        }

        public int hashCode() {
            return (Float.hashCode(this.f86122iobyxmoadg) * 31) + Integer.hashCode(this.f86123zoijcleaow);
        }

        public final float iobyxmoadg() {
            return this.f86122iobyxmoadg;
        }

        public String toString() {
            return "LimitNumberOfLine(fontSizeForMessages=" + this.f86122iobyxmoadg + ", maxLinesForMessages=" + this.f86123zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f86123zoijcleaow;
        }
    }
}
