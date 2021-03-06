; ModuleID = 'Peterson.c'
target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%union.pthread_attr_t = type { i64, [48 x i8] }

@flag0 = global i32 0, align 4
@flag1 = global i32 0, align 4
@turn = global i32 0, align 4

; Function Attrs: nounwind uwtable
define i8* @thrd0(i8* %args) #0 {
  %1 = alloca i8*, align 8
  %a = alloca i32, align 4
  %f1 = alloca i32, align 4
  %t0 = alloca i32, align 4
  store i8* %args, i8** %1, align 8
  store i32 1, i32* %a, align 4
  %2 = load i32, i32* %a, align 4
  store i32 %2, i32* @flag0, align 4
  %3 = load i32, i32* %a, align 4
  store i32 %3, i32* @turn, align 4
  %4 = load i32, i32* @flag1, align 4
  store i32 %4, i32* %f1, align 4
  %5 = load i32, i32* @turn, align 4
  store i32 %5, i32* %t0, align 4
  br label %6

; <label>:6                                       ; preds = %14, %0
  %7 = load i32, i32* %f1, align 4
  %8 = icmp eq i32 %7, 1
  br i1 %8, label %9, label %12

; <label>:9                                       ; preds = %6
  %10 = load i32, i32* %t0, align 4
  %11 = icmp eq i32 %10, 1
  br label %12

; <label>:12                                      ; preds = %9, %6
  %13 = phi i1 [ false, %6 ], [ %11, %9 ]
  br i1 %13, label %14, label %17

; <label>:14                                      ; preds = %12
  %15 = load i32, i32* @flag1, align 4
  store i32 %15, i32* %f1, align 4
  %16 = load i32, i32* @turn, align 4
  store i32 %16, i32* %t0, align 4
  br label %6

; <label>:17                                      ; preds = %12
  ret i8* null
}

; Function Attrs: nounwind uwtable
define i8* @thrd1(i8* %args) #0 {
  %1 = alloca i8*, align 8
  %b = alloca i32, align 4
  %c = alloca i32, align 4
  %f0 = alloca i32, align 4
  %t1 = alloca i32, align 4
  store i8* %args, i8** %1, align 8
  store i32 1, i32* %b, align 4
  store i32 0, i32* %c, align 4
  %2 = load i32, i32* %b, align 4
  store i32 %2, i32* @flag1, align 4
  %3 = load i32, i32* %c, align 4
  store i32 %3, i32* @turn, align 4
  %4 = load i32, i32* @flag0, align 4
  store i32 %4, i32* %f0, align 4
  %5 = load i32, i32* @turn, align 4
  store i32 %5, i32* %t1, align 4
  br label %6

; <label>:6                                       ; preds = %14, %0
  %7 = load i32, i32* %f0, align 4
  %8 = icmp eq i32 %7, 1
  br i1 %8, label %9, label %12

; <label>:9                                       ; preds = %6
  %10 = load i32, i32* %t1, align 4
  %11 = icmp eq i32 %10, 0
  br label %12

; <label>:12                                      ; preds = %9, %6
  %13 = phi i1 [ false, %6 ], [ %11, %9 ]
  br i1 %13, label %14, label %17

; <label>:14                                      ; preds = %12
  %15 = load i32, i32* @flag0, align 4
  store i32 %15, i32* %f0, align 4
  %16 = load i32, i32* @turn, align 4
  store i32 %16, i32* %t1, align 4
  br label %6

; <label>:17                                      ; preds = %12
  ret i8* null
}

; Function Attrs: nounwind uwtable
define i32 @main(i32 %argc, i8** %argv) #0 {
  %1 = alloca i32, align 4
  %2 = alloca i32, align 4
  %3 = alloca i8**, align 8
  %t0 = alloca i64, align 8
  %t1 = alloca i64, align 8
  store i32 0, i32* %1, align 4
  store i32 %argc, i32* %2, align 4
  store i8** %argv, i8*** %3, align 8
  %4 = call i32 @pthread_create(i64* %t0, %union.pthread_attr_t* null, i8* (i8*)* @thrd0, i8* null) #3
  %5 = call i32 @pthread_create(i64* %t1, %union.pthread_attr_t* null, i8* (i8*)* @thrd1, i8* null) #3
  %6 = load i64, i64* %t0, align 8
  %7 = call i32 @pthread_join(i64 %6, i8** null)
  %8 = load i64, i64* %t1, align 8
  %9 = call i32 @pthread_join(i64 %8, i8** null)
  ret i32 0
}

; Function Attrs: nounwind
declare i32 @pthread_create(i64*, %union.pthread_attr_t*, i8* (i8*)*, i8*) #1

declare i32 @pthread_join(i64, i8**) #2

attributes #0 = { nounwind uwtable "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { nounwind "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #2 = { "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #3 = { nounwind }

!llvm.ident = !{!0}

!0 = !{!"clang version 3.8.0-2ubuntu4 (tags/RELEASE_380/final)"}
