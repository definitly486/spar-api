package ru.myspar.proloyalty.story.impl.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f101661iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f101662iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f101663zoijcleaow;

        public iobyxmoadg(List groups, int i13) {
            zdlpuopuiu.btonecajqb(groups, "groups");
            this.f101662iobyxmoadg = groups;
            this.f101663zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f101662iobyxmoadg, iobyxmoadgVar.f101662iobyxmoadg) && this.f101663zoijcleaow == iobyxmoadgVar.f101663zoijcleaow;
        }

        public int hashCode() {
            return (this.f101662iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f101663zoijcleaow);
        }

        public final List iobyxmoadg() {
            return this.f101662iobyxmoadg;
        }

        public String toString() {
            return "Content(groups=" + this.f101662iobyxmoadg + ", initialGroupIndex=" + this.f101663zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f101663zoijcleaow;
        }
    }

    public ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        this.f101661iobyxmoadg = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f101661iobyxmoadg, ((ppxfxbqfkf) obj).f101661iobyxmoadg);
    }

    public int hashCode() {
        iobyxmoadg iobyxmoadgVar = this.f101661iobyxmoadg;
        if (iobyxmoadgVar == null) {
            return 0;
        }
        return iobyxmoadgVar.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f101661iobyxmoadg;
    }

    public String toString() {
        return "Model(content=" + this.f101661iobyxmoadg + ")";
    }
}
