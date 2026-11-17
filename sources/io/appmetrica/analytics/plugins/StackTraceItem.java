package io.appmetrica.analytics.plugins;

/* JADX INFO: loaded from: classes3.dex */
public class StackTraceItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f48882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f48883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f48884e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f48885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f48886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f48887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f48888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f48889e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f48885a, this.f48886b, this.f48887c, this.f48888d, this.f48889e, 0);
        }

        public Builder withClassName(String str) {
            this.f48885a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f48888d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f48886b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f48887c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f48889e = str;
            return this;
        }
    }

    /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i13) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f48880a;
    }

    public Integer getColumn() {
        return this.f48883d;
    }

    public String getFileName() {
        return this.f48881b;
    }

    public Integer getLine() {
        return this.f48882c;
    }

    public String getMethodName() {
        return this.f48884e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f48880a = str;
        this.f48881b = str2;
        this.f48882c = num;
        this.f48883d = num2;
        this.f48884e = str3;
    }
}
