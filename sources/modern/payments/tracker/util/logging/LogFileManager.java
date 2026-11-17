package modern.payments.tracker.util.logging;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.jvm.internal.gtknphoqwx;
import mg.zoijcleaow;
import mj.wkgbmnqykc;
import modern.payments.tracker.util.logging.logWriter.LogToFileWriter;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.ikoacuggdj;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lmodern/payments/tracker/util/logging/LogFileManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getCurrentLogFileContent", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Landroid/content/Context;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LogFileManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_FILE_PARSE_ERROR_MESSAGE_TAG = "PARSING LOG FILE ERROR";
    private final Context context;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/tracker/util/logging/LogFileManager$Companion;", "", "()V", "LOG_FILE_PARSE_ERROR_MESSAGE_TAG", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.tracker.util.logging.LogFileManager$getCurrentLogFileContent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "", "<anonymous>", "(Lpj/cllcsxoeiz;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.tracker.util.logging.LogFileManager$getCurrentLogFileContent$2", f = "LogFileManager.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            AnonymousClass2 anonymousClass2 = LogFileManager.this.new AnonymousClass2(gxszxtbevoVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            String strPpxfxbqfkf;
            zoijcleaow.gxszxtbevo();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            LogFileManager logFileManager = LogFileManager.this;
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                InputStream inputStreamOpenInputStream = logFileManager.context.getContentResolver().openInputStream(Uri.fromFile(new File(ExternalLogFileStorage.getFileStorageDirectory$default(new ExternalLogFileStorage(logFileManager.context), null, 1, null), LogToFileWriter.INSTANCE.getCurrentLogfileName())));
                BufferedReader bufferedReader = inputStreamOpenInputStream != null ? new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, wkgbmnqykc.f67326zoijcleaow), 8192) : null;
                if (bufferedReader != null) {
                    try {
                        strPpxfxbqfkf = rg.gtknphoqwx.ppxfxbqfkf(bufferedReader);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            rg.zoijcleaow.iobyxmoadg(bufferedReader, th2);
                            throw th3;
                        }
                    }
                } else {
                    strPpxfxbqfkf = null;
                }
                if (strPpxfxbqfkf != null && mj.kcexrzcfyt.sopmlzcsov(strPpxfxbqfkf, PrettyLogFormatter.DEFAULT_DOUBLE_DIVIDER, false, 2, null)) {
                    strPpxfxbqfkf = mj.kcexrzcfyt.hcddaimhww(strPpxfxbqfkf, PrettyLogFormatter.DEFAULT_DOUBLE_DIVIDER, PrettyLogFormatter.SHORT_DOUBLE_DIVIDER, false, 4, null);
                }
                if (strPpxfxbqfkf != null && mj.kcexrzcfyt.sopmlzcsov(strPpxfxbqfkf, PrettyLogFormatter.DEFAULT_SINGLE_DIVIDER, false, 2, null)) {
                    strPpxfxbqfkf = mj.kcexrzcfyt.hcddaimhww(strPpxfxbqfkf, PrettyLogFormatter.DEFAULT_SINGLE_DIVIDER, PrettyLogFormatter.SHORT_SINGLE_DIVIDER, false, 4, null);
                }
                rg.zoijcleaow.iobyxmoadg(bufferedReader, null);
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(strPpxfxbqfkf);
            } catch (Throwable th4) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th4));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                Log.e(LogFileManager.LOG_FILE_PARSE_ERROR_MESSAGE_TAG, thDxjokdxxww.toString());
            }
            if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                return null;
            }
            return objWkgbmnqykc;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super String> gxszxtbevoVar) {
            return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public LogFileManager(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.context = context;
    }

    public final Object getCurrentLogFileContent(lg.gxszxtbevo<? super String> gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(ikoacuggdj.zoijcleaow(), new AnonymousClass2(null), gxszxtbevoVar);
    }
}
