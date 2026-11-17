package istkbnxepw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface xrmfcynszj {

    public interface iobyxmoadg {
        default void onCaptureBufferLost(zoijcleaow zoijcleaowVar, long j13, int i13) {
        }

        default void onCaptureCompleted(zoijcleaow zoijcleaowVar, ojitshcjhn ojitshcjhnVar) {
        }

        default void onCaptureFailed(zoijcleaow zoijcleaowVar, btonecajqb btonecajqbVar) {
        }

        default void onCaptureProgressed(zoijcleaow zoijcleaowVar, ojitshcjhn ojitshcjhnVar) {
        }

        default void onCaptureSequenceAborted(int i13) {
        }

        default void onCaptureSequenceCompleted(int i13, long j13) {
        }

        default void onCaptureStarted(zoijcleaow zoijcleaowVar, long j13, long j14) {
        }
    }

    public interface zoijcleaow {
        androidx.camera.core.impl.btonecajqb getParameters();

        List getTargetOutputConfigIds();

        int getTemplateId();
    }

    int eablkybsjg(List list, iobyxmoadg iobyxmoadgVar);

    int ppxfxbqfkf(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar);

    void stopRepeating();

    int wkgbmnqykc(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar);

    void zoijcleaow();
}
