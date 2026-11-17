package modern.payments.ecomAndroid.util.jsonParamHelper.impl;

import com.google.protobuf.DescriptorProtos;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.tzroggbefp;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository;
import modern.payments.ecomAndroid.util.jsonParamHelper.JsonParamHelperUtil;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/util/jsonParamHelper/impl/JsonParamHelperUtilImpl;", "Lmodern/payments/ecomAndroid/util/jsonParamHelper/JsonParamHelperUtil;", "Lmodern/payments/ecomAndroid/domain/repository/ThreeDSecureRepository;", "threeDSecureRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/ThreeDSecureRepository;)V", "", "encryptedString", "Lmodern/payments/ecomAndroid/data/common/Constants$DeviceCategory;", "deviceCategory", "", "getParamsMap", "(Ljava/lang/String;Lmodern/payments/ecomAndroid/data/common/Constants$DeviceCategory;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/repository/ThreeDSecureRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JsonParamHelperUtilImpl implements JsonParamHelperUtil {
    private final ThreeDSecureRepository threeDSecureRepository;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Constants.DeviceCategory.values().length];
            try {
                iArr[Constants.DeviceCategory.BRW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Constants.DeviceCategory.APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Constants.DeviceCategory.THREE_RI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.util.jsonParamHelper.impl.JsonParamHelperUtilImpl$getParamsMap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.util.jsonParamHelper.impl.JsonParamHelperUtilImpl", f = "JsonParamHelperUtilImpl.kt", l = {24, C4007z9.I, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER}, m = "getParamsMap")
    static final class AnonymousClass1 extends wkgbmnqykc {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JsonParamHelperUtilImpl.this.getParamsMap(null, null, this);
        }
    }

    public JsonParamHelperUtilImpl(ThreeDSecureRepository threeDSecureRepository) {
        zdlpuopuiu.btonecajqb(threeDSecureRepository, "threeDSecureRepository");
        this.threeDSecureRepository = threeDSecureRepository;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x015e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0220  */
    /* JADX WARN: Code duplicated, block: B:67:0x0223  */
    /* JADX WARN: Code duplicated, block: B:69:0x0226  */
    /* JADX WARN: Code duplicated, block: B:70:0x022e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0232  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.util.jsonParamHelper.JsonParamHelperUtil
    public Object getParamsMap(String str, Constants.DeviceCategory deviceCategory, lg.gxszxtbevo<? super Map<String, String>> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        int i13;
        String str2;
        String str3;
        vdvldrhtss[] vdvldrhtssVarArr;
        vdvldrhtss[] vdvldrhtssVarArr2;
        vdvldrhtss[] vdvldrhtssVarArr3;
        String fieldName;
        String str4;
        Constants.DeviceCategory deviceCategory2;
        vdvldrhtss[] vdvldrhtssVarArr4;
        JsonParamHelperUtilImpl jsonParamHelperUtilImpl;
        String str5;
        ContentResponse.Success success;
        String str6;
        ContentResponse.Success success2;
        ContentResponse.Success success3;
        String str7;
        String fieldName2;
        Object sdkAppId;
        String str8;
        String str9;
        JsonParamHelperUtilImpl jsonParamHelperUtilImpl2;
        vdvldrhtss[] vdvldrhtssVarArr5;
        vdvldrhtss[] vdvldrhtssVarArr6;
        ContentResponse.Success success4;
        String str10;
        if (gxszxtbevoVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
        }
        Object iPAddress = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i15 = anonymousClass1.label;
        String str11 = "";
        int i16 = 3;
        int i17 = 2;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(iPAddress);
            int i18 = WhenMappings.$EnumSwitchMapping$0[deviceCategory.ordinal()];
            i13 = 0;
            if (i18 == 1) {
                str2 = null;
                vdvldrhtss[] vdvldrhtssVarArr7 = new vdvldrhtss[5];
                vdvldrhtssVarArr7[0] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.BROWSER_JAVA_ENABLED.getFieldName(), "true");
                vdvldrhtssVarArr7[1] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.BROWSER_USER_AGENT.getFieldName(), this.threeDSecureRepository.getBrowserUserAgent());
                vdvldrhtssVarArr7[2] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.BROWSER_IP.getFieldName(), this.threeDSecureRepository.getBrowserIPAddress());
                String fieldName3 = Constants.ThreeDSecureJsonParams.IP.getFieldName();
                ThreeDSecureRepository threeDSecureRepository = this.threeDSecureRepository;
                anonymousClass1.L$0 = vdvldrhtssVarArr7;
                anonymousClass1.L$1 = vdvldrhtssVarArr7;
                anonymousClass1.L$2 = fieldName3;
                anonymousClass1.I$0 = 3;
                anonymousClass1.label = 1;
                Object iPAddress2 = threeDSecureRepository.getIPAddress(anonymousClass1);
                if (iPAddress2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str3 = fieldName3;
                vdvldrhtssVarArr = vdvldrhtssVarArr7;
                iPAddress = iPAddress2;
                vdvldrhtssVarArr2 = vdvldrhtssVarArr;
                if (iPAddress instanceof ContentResponse.Success) {
                    success2 = (ContentResponse.Success) iPAddress;
                } else {
                    success = str2;
                }
                if (success != 0) {
                    str6 = (String) success.getData();
                } else {
                    str6 = str2;
                }
                if (str6 != null) {
                    success = success2;
                    success = success2;
                    str11 = str6;
                }
                success = success2;
                success = success2;
                vdvldrhtssVarArr[i16] = cqumvgiudr.iobyxmoadg(str3, str11);
                vdvldrhtssVarArr2[4] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.CHALLENGE_WINDOW_SIZE.getFieldName(), "05");
                return tzroggbefp.draadjrbmk(vdvldrhtssVarArr2);
            }
            if (i18 != 2) {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                String fieldName4 = Constants.ThreeDSecureJsonParams.IP.getFieldName();
                ThreeDSecureRepository threeDSecureRepository2 = this.threeDSecureRepository;
                anonymousClass1.L$0 = fieldName4;
                anonymousClass1.label = 4;
                Object iPAddress3 = threeDSecureRepository2.getIPAddress(anonymousClass1);
                if (iPAddress3 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str5 = fieldName4;
                iPAddress = iPAddress3;
                if (iPAddress instanceof ContentResponse.Success) {
                    success4 = (ContentResponse.Success) iPAddress;
                } else {
                    success4 = null;
                }
                if (success4 != null) {
                    str10 = (String) success4.getData();
                } else {
                    str10 = null;
                }
                return tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(str5, str10 != null ? str10 : ""));
            }
            vdvldrhtssVarArr3 = new vdvldrhtss[8];
            fieldName = Constants.ThreeDSecureJsonParams.IP.getFieldName();
            ThreeDSecureRepository threeDSecureRepository3 = this.threeDSecureRepository;
            anonymousClass1.L$0 = this;
            str4 = str;
            anonymousClass1.L$1 = str4;
            anonymousClass1.L$2 = deviceCategory;
            anonymousClass1.L$3 = vdvldrhtssVarArr3;
            anonymousClass1.L$4 = vdvldrhtssVarArr3;
            anonymousClass1.L$5 = fieldName;
            anonymousClass1.I$0 = 0;
            anonymousClass1.label = 2;
            iPAddress = threeDSecureRepository3.getIPAddress(anonymousClass1);
            if (iPAddress == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            deviceCategory2 = deviceCategory;
            vdvldrhtssVarArr4 = vdvldrhtssVarArr3;
            jsonParamHelperUtilImpl = this;
            if (iPAddress instanceof ContentResponse.Success) {
                success3 = (ContentResponse.Success) iPAddress;
            } else {
                success3 = null;
            }
            if (success3 != null) {
                str7 = (String) success3.getData();
            } else {
                str7 = null;
            }
            vdvldrhtssVarArr4[i13] = cqumvgiudr.iobyxmoadg(fieldName, str7 != null ? str7 : "");
            vdvldrhtssVarArr3[1] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.DEVICE_CATEGORY.getFieldName(), deviceCategory2.getCode());
            fieldName2 = Constants.ThreeDSecureJsonParams.SDK_APP_ID.getFieldName();
            ThreeDSecureRepository threeDSecureRepository4 = jsonParamHelperUtilImpl.threeDSecureRepository;
            anonymousClass1.L$0 = jsonParamHelperUtilImpl;
            anonymousClass1.L$1 = str4;
            anonymousClass1.L$2 = vdvldrhtssVarArr3;
            anonymousClass1.L$3 = vdvldrhtssVarArr3;
            anonymousClass1.L$4 = fieldName2;
            anonymousClass1.L$5 = null;
            anonymousClass1.I$0 = 2;
            anonymousClass1.label = 3;
            sdkAppId = threeDSecureRepository4.getSdkAppId(anonymousClass1);
            if (sdkAppId == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            str8 = fieldName2;
            iPAddress = sdkAppId;
            str9 = str4;
            jsonParamHelperUtilImpl2 = jsonParamHelperUtilImpl;
            vdvldrhtssVarArr5 = vdvldrhtssVarArr3;
            vdvldrhtssVarArr6 = vdvldrhtssVarArr5;
        } else {
            if (i15 == 1) {
                i16 = anonymousClass1.I$0;
                str3 = (String) anonymousClass1.L$2;
                vdvldrhtssVarArr = (vdvldrhtss[]) anonymousClass1.L$1;
                vdvldrhtssVarArr2 = (vdvldrhtss[]) anonymousClass1.L$0;
                gg.zdlpuopuiu.zoijcleaow(iPAddress);
                str2 = null;
                if (iPAddress instanceof ContentResponse.Success) {
                    success2 = (ContentResponse.Success) iPAddress;
                } else {
                    success = str2;
                }
                if (success != 0) {
                    str6 = (String) success.getData();
                } else {
                    str6 = str2;
                }
                if (str6 != null) {
                    success = success2;
                    success = success2;
                    str11 = str6;
                }
                success = success2;
                success = success2;
                vdvldrhtssVarArr[i16] = cqumvgiudr.iobyxmoadg(str3, str11);
                vdvldrhtssVarArr2[4] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.CHALLENGE_WINDOW_SIZE.getFieldName(), "05");
                return tzroggbefp.draadjrbmk(vdvldrhtssVarArr2);
            }
            if (i15 == 2) {
                i13 = anonymousClass1.I$0;
                fieldName = (String) anonymousClass1.L$5;
                vdvldrhtss[] vdvldrhtssVarArr8 = (vdvldrhtss[]) anonymousClass1.L$4;
                vdvldrhtss[] vdvldrhtssVarArr9 = (vdvldrhtss[]) anonymousClass1.L$3;
                deviceCategory2 = (Constants.DeviceCategory) anonymousClass1.L$2;
                str4 = (String) anonymousClass1.L$1;
                jsonParamHelperUtilImpl = (JsonParamHelperUtilImpl) anonymousClass1.L$0;
                gg.zdlpuopuiu.zoijcleaow(iPAddress);
                vdvldrhtssVarArr4 = vdvldrhtssVarArr8;
                vdvldrhtssVarArr3 = vdvldrhtssVarArr9;
                if (iPAddress instanceof ContentResponse.Success) {
                    success3 = (ContentResponse.Success) iPAddress;
                } else {
                    success3 = null;
                }
                if (success3 != null) {
                    str7 = (String) success3.getData();
                } else {
                    str7 = null;
                }
                vdvldrhtssVarArr4[i13] = cqumvgiudr.iobyxmoadg(fieldName, str7 != null ? str7 : "");
                vdvldrhtssVarArr3[1] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.DEVICE_CATEGORY.getFieldName(), deviceCategory2.getCode());
                fieldName2 = Constants.ThreeDSecureJsonParams.SDK_APP_ID.getFieldName();
                ThreeDSecureRepository threeDSecureRepository5 = jsonParamHelperUtilImpl.threeDSecureRepository;
                anonymousClass1.L$0 = jsonParamHelperUtilImpl;
                anonymousClass1.L$1 = str4;
                anonymousClass1.L$2 = vdvldrhtssVarArr3;
                anonymousClass1.L$3 = vdvldrhtssVarArr3;
                anonymousClass1.L$4 = fieldName2;
                anonymousClass1.L$5 = null;
                anonymousClass1.I$0 = 2;
                anonymousClass1.label = 3;
                sdkAppId = threeDSecureRepository5.getSdkAppId(anonymousClass1);
                if (sdkAppId == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str8 = fieldName2;
                iPAddress = sdkAppId;
                str9 = str4;
                jsonParamHelperUtilImpl2 = jsonParamHelperUtilImpl;
                vdvldrhtssVarArr5 = vdvldrhtssVarArr3;
                vdvldrhtssVarArr6 = vdvldrhtssVarArr5;
            } else {
                if (i15 != 3) {
                    if (i15 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) anonymousClass1.L$0;
                    gg.zdlpuopuiu.zoijcleaow(iPAddress);
                    if (iPAddress instanceof ContentResponse.Success) {
                        success4 = (ContentResponse.Success) iPAddress;
                    } else {
                        success4 = null;
                    }
                    if (success4 != null) {
                        str10 = (String) success4.getData();
                    } else {
                        str10 = null;
                    }
                    return tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(str5, str10 != null ? str10 : ""));
                }
                i17 = anonymousClass1.I$0;
                str8 = (String) anonymousClass1.L$4;
                vdvldrhtssVarArr5 = (vdvldrhtss[]) anonymousClass1.L$3;
                vdvldrhtssVarArr6 = (vdvldrhtss[]) anonymousClass1.L$2;
                str9 = (String) anonymousClass1.L$1;
                jsonParamHelperUtilImpl2 = (JsonParamHelperUtilImpl) anonymousClass1.L$0;
                gg.zdlpuopuiu.zoijcleaow(iPAddress);
            }
        }
        vdvldrhtssVarArr5[i17] = cqumvgiudr.iobyxmoadg(str8, iPAddress);
        vdvldrhtssVarArr6[3] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.SDK_REFERENCE_NUMBER.getFieldName(), jsonParamHelperUtilImpl2.threeDSecureRepository.getSdkReferenceNumber());
        vdvldrhtssVarArr6[4] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.SDK_TRANS_ID.getFieldName(), jsonParamHelperUtilImpl2.threeDSecureRepository.getTransId());
        vdvldrhtssVarArr6[5] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.SDK_MAX_TIMEOUT.getFieldName(), jsonParamHelperUtilImpl2.threeDSecureRepository.getMaxTimeout());
        vdvldrhtssVarArr6[6] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.SDK_ENC_DATA.getFieldName(), str9);
        vdvldrhtssVarArr6[7] = cqumvgiudr.iobyxmoadg(Constants.ThreeDSecureJsonParams.SDK_EPHEM_PUB_KEY.getFieldName(), jsonParamHelperUtilImpl2.threeDSecureRepository.getEphemPubKey());
        return tzroggbefp.draadjrbmk(vdvldrhtssVarArr6);
    }
}
