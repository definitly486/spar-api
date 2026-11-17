package bl;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
final class lmojexxdyd extends iobyxmoadg {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final Socket f16716ojitshcjhn;

    public lmojexxdyd(Socket socket) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(socket, "socket");
        this.f16716ojitshcjhn = socket;
    }

    @Override // bl.iobyxmoadg
    protected IOException cqumvgiudr(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // bl.iobyxmoadg
    protected void zynmafqrjb() {
        try {
            this.f16716ojitshcjhn.close();
        } catch (AssertionError e13) {
            if (!zdlpuopuiu.wkgbmnqykc(e13)) {
                throw e13;
            }
            yggfygwlhe.f16755iobyxmoadg.log(Level.WARNING, "Failed to close timed out socket " + this.f16716ojitshcjhn, (Throwable) e13);
        } catch (Exception e14) {
            yggfygwlhe.f16755iobyxmoadg.log(Level.WARNING, "Failed to close timed out socket " + this.f16716ojitshcjhn, (Throwable) e14);
        }
    }
}
