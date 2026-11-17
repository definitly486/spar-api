package com.bumptech.glide.integration.compose;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final int f20639iobyxmoadg = 0;

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f20640zoijcleaow = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final l8.iobyxmoadg f20641zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(l8.iobyxmoadg dataSource) {
            super(null);
            zdlpuopuiu.btonecajqb(dataSource, "dataSource");
            this.f20641zoijcleaow = dataSource;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f20641zoijcleaow == ((ppxfxbqfkf) obj).f20641zoijcleaow;
        }

        public int hashCode() {
            return this.f20641zoijcleaow.hashCode();
        }

        public String toString() {
            return "Success(dataSource=" + this.f20641zoijcleaow + ')';
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f20642zoijcleaow = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
