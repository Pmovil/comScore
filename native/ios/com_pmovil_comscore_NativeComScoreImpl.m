#import "com_pmovil_comscore_NativeComScoreImpl.h"
#import "CSComScore.h"

@implementation com_pmovil_comscore_NativeComScoreImpl

-(void)initComScore{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore setAppContext];
    });
}

-(void)setCustomerC2:(NSString*)param{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore setCustomerC2:param];
    });
}

-(void)setPublisherSecret:(NSString*)param{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore setPublisherSecret:param];
    });
}

-(void)setAppName:(NSString*)param{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore setAppName:param];
    });
}

-(void)onEnterForeground{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore onEnterForeground];
    });
}

-(void)onExitForeground{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore onExitForeground];
    });
}

-(void)onUxActive{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore onUxActive];
    });
}

-(void)onUxInactive{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore onUxInactive];
    });
}

-(void)enableAutoUpdate:(int)param param1:(BOOL)param1{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore enableAutoUpdate:param foregroundOnly:param1];
    });
}

-(void)view:(NSString*)param param1:(NSString*)param1{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore viewWithLabels:[NSDictionary dictionaryWithObjectsAndKeys:param, param1,nil]];
    });
}

-(void)setLabel:(NSString*)param param1:(NSString*)param1{
    dispatch_async(dispatch_get_main_queue(), ^{
        [CSComScore setLabel:param value:param1];
    });
}

-(BOOL)isSupported{
    return YES;
}

@end
