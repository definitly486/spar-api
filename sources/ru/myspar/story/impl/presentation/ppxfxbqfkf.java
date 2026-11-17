package ru.myspar.story.impl.presentation;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f104327iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f104328iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f104329zoijcleaow;

        public iobyxmoadg(List groups, int i13) {
            zdlpuopuiu.btonecajqb(groups, "groups");
            this.f104328iobyxmoadg = groups;
            this.f104329zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f104328iobyxmoadg, iobyxmoadgVar.f104328iobyxmoadg) && this.f104329zoijcleaow == iobyxmoadgVar.f104329zoijcleaow;
        }

        public int hashCode() {
            return (this.f104328iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f104329zoijcleaow);
        }

        public final List iobyxmoadg() {
            return this.f104328iobyxmoadg;
        }

        public String toString() {
            return "Content(groups=" + this.f104328iobyxmoadg + ", initialGroupIndex=" + this.f104329zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f104329zoijcleaow;
        }
    }

    public ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        this.f104327iobyxmoadg = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104327iobyxmoadg, ((ppxfxbqfkf) obj).f104327iobyxmoadg);
    }

    public int hashCode() {
        iobyxmoadg iobyxmoadgVar = this.f104327iobyxmoadg;
        if (iobyxmoadgVar == null) {
            return 0;
        }
        return iobyxmoadgVar.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f104327iobyxmoadg;
    }

    public String toString() {
        return "Model(content=" + this.f104327iobyxmoadg + ")";
    }
}
