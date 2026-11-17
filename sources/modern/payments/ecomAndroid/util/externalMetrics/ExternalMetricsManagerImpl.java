package modern.payments.ecomAndroid.util.externalMetrics;

import cm.gxszxtbevo;
import cm.rgvfuqvkyq;
import com.google.gson.btonecajqb;
import com.google.gson.eablkybsjg;
import em.iobyxmoadg;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.externalMetrics.ExternalMetricsManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J-\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lmodern/payments/ecomAndroid/util/externalMetrics/ExternalMetricsManagerImpl;", "Lmodern/payments/ecomAndroid/domain/externalMetrics/ExternalMetricsManager;", "<init>", "()V", "", "getLocalDateTime", "()Ljava/lang/String;", "Lgg/wwaezpbzkn;", "startCollectingMetrics", "actionName", "", ExternalMetricsManagerImpl.VALUES, "writeDownMetric", "(Ljava/lang/String;Ljava/util/Map;)V", "getJsonMetricsResult", "Lcom/google/gson/eablkybsjg;", "json", "Lcom/google/gson/eablkybsjg;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExternalMetricsManagerImpl implements ExternalMetricsManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String DATE = "date";

    @Deprecated
    public static final String NAME = "name";

    @Deprecated
    public static final String VALUES = "values";
    private eablkybsjg json;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/util/externalMetrics/ExternalMetricsManagerImpl$Companion;", "", "()V", "DATE", "", "NAME", "VALUES", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    private final String getLocalDateTime() {
        String strKcexrzcfyt = gxszxtbevo.hkdspvbjdz().yadqdtsiqt(rgvfuqvkyq.pmvmpeiblj()).ulzqkzuiru().kcexrzcfyt(iobyxmoadg.f31458ojitshcjhn);
        zdlpuopuiu.dxjokdxxww(strKcexrzcfyt, "run(...)");
        return strKcexrzcfyt;
    }

    @Override // modern.payments.ecomAndroid.domain.externalMetrics.ExternalMetricsManager
    public String getJsonMetricsResult() {
        return String.valueOf(this.json);
    }

    @Override // modern.payments.ecomAndroid.domain.externalMetrics.ExternalMetricsManager
    public void startCollectingMetrics() {
        this.json = new eablkybsjg();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // modern.payments.ecomAndroid.domain.externalMetrics.ExternalMetricsManager
    public void writeDownMetric(String actionName, Map<String, String> values) {
        zdlpuopuiu.btonecajqb(actionName, "actionName");
        btonecajqb btonecajqbVar = new btonecajqb();
        btonecajqbVar.agtfadlqog(NAME, actionName);
        btonecajqbVar.agtfadlqog(DATE, getLocalDateTime());
        if (values != null) {
            btonecajqb btonecajqbVar2 = new btonecajqb();
            for (Map.Entry<String, String> entry : values.entrySet()) {
                String key = entry.getKey();
                btonecajqbVar2.agtfadlqog(values.get(key), entry.getValue());
            }
            btonecajqbVar.wflxmlrfwp(VALUES, btonecajqbVar2);
        }
        eablkybsjg eablkybsjgVar = this.json;
        if (eablkybsjgVar != null) {
            eablkybsjgVar.wflxmlrfwp(btonecajqbVar);
        }
    }
}
