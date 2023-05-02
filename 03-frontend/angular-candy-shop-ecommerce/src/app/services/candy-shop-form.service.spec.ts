import { TestBed } from '@angular/core/testing';

import { CandyShopFormService } from './candy-shop-form.service';

describe('CandyShopFormService', () => {
  let service: CandyShopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CandyShopFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
