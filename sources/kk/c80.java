package kk;

import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes3.dex */
public final class c80 {
    public static sr iobyxmoadg(FraudMonCheckResult fraudMonCheckResult) {
        if (fraudMonCheckResult == null) {
            return go.f56727iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fraudMonCheckResult.getActionCode(), "REVIEW") && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fraudMonCheckResult.getConfirmMethodFactor(), "SMSP") && !fraudMonCheckResult.isClientBlock()) {
            return new kp(fraudMonCheckResult);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fraudMonCheckResult.getActionCode(), "REVIEW") && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fraudMonCheckResult.getConfirmMethodFactor(), "HINT") && !fraudMonCheckResult.isClientBlock()) {
            return new oq(fraudMonCheckResult);
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fraudMonCheckResult.getActionCode(), "DENY") || fraudMonCheckResult.isClientBlock()) {
            return (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fraudMonCheckResult.getActionCode(), "DENY") && fraudMonCheckResult.isClientBlock()) ? new bn(fraudMonCheckResult) : go.f56727iobyxmoadg;
        }
        return new zl(fraudMonCheckResult);
    }
}
