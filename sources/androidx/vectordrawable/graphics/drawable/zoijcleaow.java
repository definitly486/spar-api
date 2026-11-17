package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    Animatable2.AnimationCallback f13693iobyxmoadg;

    class iobyxmoadg extends Animatable2.AnimationCallback {
        iobyxmoadg() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            zoijcleaow.this.zoijcleaow(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            zoijcleaow.this.ppxfxbqfkf(drawable);
        }
    }

    Animatable2.AnimationCallback iobyxmoadg() {
        if (this.f13693iobyxmoadg == null) {
            this.f13693iobyxmoadg = new iobyxmoadg();
        }
        return this.f13693iobyxmoadg;
    }

    public void ppxfxbqfkf(Drawable drawable) {
    }

    public void zoijcleaow(Drawable drawable) {
    }
}
