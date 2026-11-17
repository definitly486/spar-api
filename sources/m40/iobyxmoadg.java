package m40;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iwizpuwonk;
import mj.kcexrzcfyt;
import ru.myspar.core.error_handler.exceptions.IncorrectBitrixVersionException;
import ru.myspar.core.error_handler.exceptions.RequestException;
import ru.myspar.core.error_handler.exceptions.TechnicalWorkException;
import ru.myspar.core.network.model.ErrorResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements iwizpuwonk {
    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) throws RequestException {
        zdlpuopuiu.btonecajqb(chain, "chain");
        try {
            cdpycssgdh cdpycssgdhVarZoijcleaow = chain.zoijcleaow(chain.dxjokdxxww());
            String strAgtfadlqog = cdpycssgdhVarZoijcleaow.lereixgezr(Long.MAX_VALUE).agtfadlqog();
            if (kcexrzcfyt.sopmlzcsov(strAgtfadlqog, "requireRestart", false, 2, null)) {
                throw new IncorrectBitrixVersionException();
            }
            if (cdpycssgdhVarZoijcleaow.btonecajqb() != 403 || !kcexrzcfyt.sopmlzcsov(strAgtfadlqog, "technical_work", false, 2, null)) {
                return cdpycssgdhVarZoijcleaow;
            }
            ErrorResponse error = ppxfxbqfkf.zoijcleaow(cdpycssgdhVarZoijcleaow).getError();
            String message = error != null ? error.getMessage() : null;
            if (message == null) {
                message = "";
            }
            throw new TechnicalWorkException(message);
        } catch (Throwable th2) {
            if ((th2 instanceof SocketTimeoutException) || (th2 instanceof SSLHandshakeException) || (th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof IncorrectBitrixVersionException) || (th2 instanceof TechnicalWorkException)) {
                throw th2;
            }
            throw new RequestException(th2.getLocalizedMessage(), th2);
        }
    }
}
