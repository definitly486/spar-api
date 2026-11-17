package com.bumptech.glide.integration.compose;

import com.bumptech.glide.wflxmlrfwp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final int f20637iobyxmoadg = 0;

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f20638zoijcleaow;

        public iobyxmoadg(int i13) {
            super(null);
            this.f20638zoijcleaow = i13;
        }

        public final int eablkybsjg() {
            return this.f20638zoijcleaow;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public final wflxmlrfwp iobyxmoadg(draadjrbmk resource, draadjrbmk drawable) {
        zdlpuopuiu.btonecajqb(resource, "resource");
        zdlpuopuiu.btonecajqb(drawable, "drawable");
        return this instanceof iobyxmoadg ? (wflxmlrfwp) resource.invoke(Integer.valueOf(((iobyxmoadg) this).eablkybsjg())) : (wflxmlrfwp) drawable.invoke(null);
    }

    public final rgvfuqvkyq ppxfxbqfkf() {
        return null;
    }

    public final l.ppxfxbqfkf wkgbmnqykc() {
        return null;
    }

    public final boolean zoijcleaow() {
        if (this instanceof iobyxmoadg) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private eablkybsjg() {
    }
}
