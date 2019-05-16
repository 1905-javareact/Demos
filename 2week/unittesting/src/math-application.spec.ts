const mockCalc = {
    add: jest.fn(),//jest will make a fake function for us to use
    divide: jest.fn()
}

//we mock the import from calculator.ts with our mockCalc
jest.mock('./calculator', ()=>{
    return mockCalc
})

//we are testing the mathapp
import {avg} from './math-application'


//set up a test suite
describe('math application avg tests', ()=>{

    beforeAll(()=>{
        mockCalc.add.mockImplementation((one,two)=> one+two)
        mockCalc.divide.mockImplementation((one,two)=> one/two)
    })

    // afterAll(()=>{
        
    // })

    test('avg should be 6 for params 4,6,8', ()=>{
        const res = avg(4,6,8)
        expect(res).toEqual(6)//asserts
    })

    it('should return -10 for params -15, -10, -5', ()=>{
        const res = avg(-15, -10, -5)
        expect(res).toEqual(-10)
    })

    // it('should not work if I don\'t write a test')


})

