package istkbnxepw;

import android.util.Size;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface yfnezrywwk {

    public interface iobyxmoadg {
        default void eablkybsjg(int i13) {
        }

        void iobyxmoadg(int i13);

        default void onCaptureProcessProgressed(int i13) {
        }

        default void onCaptureSequenceAborted(int i13) {
        }

        void ppxfxbqfkf(int i13, long j13);

        void wkgbmnqykc(long j13, int i13, ojitshcjhn ojitshcjhnVar);

        void zoijcleaow(int i13);
    }

    void deInitSession();

    Set getSupportedCameraOperations();

    Map getSupportedPostviewSize(Size size);

    androidx.camera.core.impl.jyumaefscl initSession(lereixgezr.agtfadlqog agtfadlqogVar, ribwqtqdhb ribwqtqdhbVar);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(xrmfcynszj xrmfcynszjVar);

    void setParameters(androidx.camera.core.impl.btonecajqb btonecajqbVar);

    int startCapture(boolean z13, opjhrmiecq opjhrmiecqVar, iobyxmoadg iobyxmoadgVar);

    int startRepeating(opjhrmiecq opjhrmiecqVar, iobyxmoadg iobyxmoadgVar);

    int startTrigger(androidx.camera.core.impl.btonecajqb btonecajqbVar, opjhrmiecq opjhrmiecqVar, iobyxmoadg iobyxmoadgVar);

    void stopRepeating();
}
