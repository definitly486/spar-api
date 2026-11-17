package modern.payments.ecomAndroid.util.htmlParser;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004H&¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser;", "", "extractAllFormBlocks", "", "", "html", "extractAllFormsWithCRes", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormWithCRes;", "extractAllFormsWithPaRes", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormWithPaRes;", "extractCResValue", "formBlock", "extractCResValueRobust", "extractFormsWithAttributes", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;", "extractPaResValue", "extractPaResValueRobust", "FormData", "FormWithCRes", "FormWithPaRes", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HtmlFormParser {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;", "", "action", "", "method", "id", ExternalMetricsManagerImpl.NAME, "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getContent", "getId", "getMethod", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormData {
        private final String action;
        private final String content;
        private final String id;
        private final String method;
        private final String name;

        public FormData(String str, String str2, String str3, String str4, String content) {
            zdlpuopuiu.btonecajqb(content, "content");
            this.action = str;
            this.method = str2;
            this.id = str3;
            this.name = str4;
            this.content = content;
        }

        public static /* synthetic */ FormData copy$default(FormData formData, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = formData.action;
            }
            if ((i13 & 2) != 0) {
                str2 = formData.method;
            }
            String str6 = str2;
            if ((i13 & 4) != 0) {
                str3 = formData.id;
            }
            String str7 = str3;
            if ((i13 & 8) != 0) {
                str4 = formData.name;
            }
            String str8 = str4;
            if ((i13 & 16) != 0) {
                str5 = formData.content;
            }
            return formData.copy(str, str6, str7, str8, str5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public final FormData copy(String action, String method, String id2, String name, String content) {
            zdlpuopuiu.btonecajqb(content, "content");
            return new FormData(action, method, id2, name, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormData)) {
                return false;
            }
            FormData formData = (FormData) other;
            return zdlpuopuiu.eablkybsjg(this.action, formData.action) && zdlpuopuiu.eablkybsjg(this.method, formData.method) && zdlpuopuiu.eablkybsjg(this.id, formData.id) && zdlpuopuiu.eablkybsjg(this.name, formData.name) && zdlpuopuiu.eablkybsjg(this.content, formData.content);
        }

        public final String getAction() {
            return this.action;
        }

        public final String getContent() {
            return this.content;
        }

        public final String getId() {
            return this.id;
        }

        public final String getMethod() {
            return this.method;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.action;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.method;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.id;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.name;
            return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "FormData(action=" + this.action + ", method=" + this.method + ", id=" + this.id + ", name=" + this.name + ", content=" + this.content + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormWithCRes;", "", "form", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;", "cresValue", "", "(Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;Ljava/lang/String;)V", "getCresValue", "()Ljava/lang/String;", "getForm", "()Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormWithCRes {
        private final String cresValue;
        private final FormData form;

        public FormWithCRes(FormData form, String str) {
            zdlpuopuiu.btonecajqb(form, "form");
            this.form = form;
            this.cresValue = str;
        }

        public static /* synthetic */ FormWithCRes copy$default(FormWithCRes formWithCRes, FormData formData, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                formData = formWithCRes.form;
            }
            if ((i13 & 2) != 0) {
                str = formWithCRes.cresValue;
            }
            return formWithCRes.copy(formData, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FormData getForm() {
            return this.form;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCresValue() {
            return this.cresValue;
        }

        public final FormWithCRes copy(FormData form, String cresValue) {
            zdlpuopuiu.btonecajqb(form, "form");
            return new FormWithCRes(form, cresValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormWithCRes)) {
                return false;
            }
            FormWithCRes formWithCRes = (FormWithCRes) other;
            return zdlpuopuiu.eablkybsjg(this.form, formWithCRes.form) && zdlpuopuiu.eablkybsjg(this.cresValue, formWithCRes.cresValue);
        }

        public final String getCresValue() {
            return this.cresValue;
        }

        public final FormData getForm() {
            return this.form;
        }

        public int hashCode() {
            int iHashCode = this.form.hashCode() * 31;
            String str = this.cresValue;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "FormWithCRes(form=" + this.form + ", cresValue=" + this.cresValue + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormWithPaRes;", "", "form", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;", "paresValue", "", "(Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;Ljava/lang/String;)V", "getForm", "()Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser$FormData;", "getParesValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FormWithPaRes {
        private final FormData form;
        private final String paresValue;

        public FormWithPaRes(FormData form, String str) {
            zdlpuopuiu.btonecajqb(form, "form");
            this.form = form;
            this.paresValue = str;
        }

        public static /* synthetic */ FormWithPaRes copy$default(FormWithPaRes formWithPaRes, FormData formData, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                formData = formWithPaRes.form;
            }
            if ((i13 & 2) != 0) {
                str = formWithPaRes.paresValue;
            }
            return formWithPaRes.copy(formData, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FormData getForm() {
            return this.form;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getParesValue() {
            return this.paresValue;
        }

        public final FormWithPaRes copy(FormData form, String paresValue) {
            zdlpuopuiu.btonecajqb(form, "form");
            return new FormWithPaRes(form, paresValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormWithPaRes)) {
                return false;
            }
            FormWithPaRes formWithPaRes = (FormWithPaRes) other;
            return zdlpuopuiu.eablkybsjg(this.form, formWithPaRes.form) && zdlpuopuiu.eablkybsjg(this.paresValue, formWithPaRes.paresValue);
        }

        public final FormData getForm() {
            return this.form;
        }

        public final String getParesValue() {
            return this.paresValue;
        }

        public int hashCode() {
            int iHashCode = this.form.hashCode() * 31;
            String str = this.paresValue;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "FormWithPaRes(form=" + this.form + ", paresValue=" + this.paresValue + ')';
        }
    }

    List<String> extractAllFormBlocks(String html);

    List<FormWithCRes> extractAllFormsWithCRes(String html);

    List<FormWithPaRes> extractAllFormsWithPaRes(String html);

    String extractCResValue(String formBlock);

    String extractCResValueRobust(String formBlock);

    List<FormData> extractFormsWithAttributes(String html);

    String extractPaResValue(String formBlock);

    String extractPaResValueRobust(String formBlock);
}
