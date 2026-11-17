package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
abstract class nufgyqmvbu extends ra.lqeggnwhkg {

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    zoijcleaow f23333tzroggbefp;

    private static class ppxfxbqfkf extends nufgyqmvbu {
        ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
            super(zoijcleaowVar);
        }

        @Override // ra.lqeggnwhkg
        protected void oxmwwwfdhm(Canvas canvas) {
            if (this.f23333tzroggbefp.f23334iwizpuwonk.isEmpty()) {
                super.oxmwwwfdhm(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f23333tzroggbefp.f23334iwizpuwonk);
            super.oxmwwwfdhm(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nufgyqmvbu sflfametgt(zoijcleaow zoijcleaowVar) {
        return new ppxfxbqfkf(zoijcleaowVar);
    }

    static nufgyqmvbu zfvoamnweg(ra.gtknphoqwx gtknphoqwxVar) {
        if (gtknphoqwxVar == null) {
            gtknphoqwxVar = new ra.gtknphoqwx();
        }
        return sflfametgt(new zoijcleaow(gtknphoqwxVar, new RectF()));
    }

    void bfopjjpdmp() {
        opjhrmiecq(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void iyctptxqzt(RectF rectF) {
        opjhrmiecq(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // ra.lqeggnwhkg, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f23333tzroggbefp = new zoijcleaow(this.f23333tzroggbefp);
        return this;
    }

    boolean oipsdeybqn() {
        return !this.f23333tzroggbefp.f23334iwizpuwonk.isEmpty();
    }

    void opjhrmiecq(float f13, float f14, float f15, float f16) {
        if (f13 == this.f23333tzroggbefp.f23334iwizpuwonk.left && f14 == this.f23333tzroggbefp.f23334iwizpuwonk.top && f15 == this.f23333tzroggbefp.f23334iwizpuwonk.right && f16 == this.f23333tzroggbefp.f23334iwizpuwonk.bottom) {
            return;
        }
        this.f23333tzroggbefp.f23334iwizpuwonk.set(f13, f14, f15, f16);
        invalidateSelf();
    }

    private static final class zoijcleaow extends ra.lqeggnwhkg.ppxfxbqfkf {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final RectF f23334iwizpuwonk;

        @Override // ra.lqeggnwhkg.ppxfxbqfkf, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            nufgyqmvbu nufgyqmvbuVarSflfametgt = nufgyqmvbu.sflfametgt(this);
            nufgyqmvbuVarSflfametgt.invalidateSelf();
            return nufgyqmvbuVarSflfametgt;
        }

        private zoijcleaow(ra.gtknphoqwx gtknphoqwxVar, RectF rectF) {
            super(gtknphoqwxVar, null);
            this.f23334iwizpuwonk = rectF;
        }

        private zoijcleaow(zoijcleaow zoijcleaowVar) {
            super(zoijcleaowVar);
            this.f23334iwizpuwonk = zoijcleaowVar.f23334iwizpuwonk;
        }
    }

    private nufgyqmvbu(zoijcleaow zoijcleaowVar) {
        super(zoijcleaowVar);
        this.f23333tzroggbefp = zoijcleaowVar;
    }
}
