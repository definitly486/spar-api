package t;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class hcddaimhww {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.zoijcleaow f109082zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(androidx.compose.ui.viewinterop.zoijcleaow zoijcleaowVar) {
            super(1);
            this.f109082zdlpuopuiu = zoijcleaowVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f109082zdlpuopuiu.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f109082zdlpuopuiu.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.ui.viewinterop.zoijcleaow zoijcleaowVar) {
        pkzmftpjix pkzmftpjixVar = new pkzmftpjix();
        pkzmftpjixVar.ojitshcjhn(new iobyxmoadg(zoijcleaowVar));
        stevsuqkhv stevsuqkhvVar = new stevsuqkhv();
        pkzmftpjixVar.rgvfuqvkyq(stevsuqkhvVar);
        zoijcleaowVar.setOnRequestDisallowInterceptTouchEvent$ui_release(stevsuqkhvVar);
        return wkgbmnqykcVar.eablkybsjg(pkzmftpjixVar);
    }
}
