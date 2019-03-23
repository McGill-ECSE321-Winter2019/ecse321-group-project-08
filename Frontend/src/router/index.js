import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Welcome from '@/components/Welcome'
import CreateAccount from '@/components/CreateAccount'
import Dashboard from '@/components/Dashboard'
import ConfirmStudentStart from '@/components/ConfirmStudentStart'
import ConfirmStudentCompletion from '@/components/ConfirmStudentCompletion'
import DownloadCoopForm from '@/components/DownloadCoopForm'
import TaxCreditForm from '@/components/TaxCreditForm'
import DownloadTaxCreditForm from '@/components/DownloadTaxCreditForm'
import LoginPage from '@/components/LoginPage'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/hello',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/welcome',
      name: 'Welcome',
      component: Welcome
      

    },
    {
      path: '/createAccount',
      name: 'CreateAccount',
      component: CreateAccount
    }
    ,
    {
      path: '/Dashboard',
      name: 'Dashboard',
      component: Dashboard
    }
    ,
    {
      path: '/ConfirmStudentStart',
      name: 'ConfirmStudentStart',
      component: ConfirmStudentStart
    }
    ,
    {
      path: '/ConfirmStudentCompletion',
      name: 'ConfirmStudentCompletion',
      component: ConfirmStudentCompletion
    }
    ,
    {
      path: '/DownloadCoopForm',
      name: 'DownloadCoopForm',
      component: DownloadCoopForm
    }
    ,
    {
      path: '/TaxCreditForm',
      name: 'TaxCreditForm',
      component: TaxCreditForm
    }
    ,
    {
      path: '/DownloadTaxCreditForm',
      name: 'DownloadTaxCreditForm',
      component: DownloadTaxCreditForm
    }
    ,
    {
      path: '/LoginPage',
      name: 'LoginPage',
      component: LoginPage
    }
    
  ]
})
