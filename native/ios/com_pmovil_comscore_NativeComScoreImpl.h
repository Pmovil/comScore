#import <Foundation/Foundation.h>

@interface com_pmovil_comscore_NativeComScoreImpl : NSObject {
}

-(void)initComScore;
-(void)setCustomerC2:(NSString*)param;
-(void)setPublisherSecret:(NSString*)param;
-(void)setAppName:(NSString*)param;
-(void)onEnterForeground;
-(void)onExitForeground;
-(void)onUxActive;
-(void)onUxInactive;
-(void)enableAutoUpdate:(int)param param1:(BOOL)param1;
-(BOOL)isSupported;

@end
